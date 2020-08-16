package com.mt.service;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.pagehelper.PageHelper;
import com.mt.bean.PmsProduct;
import com.mt.bean.PmsProductCategory;
import com.mt.bean.PmsProductCategoryAttributeRelation;
import com.mt.dto.PmsProductCategoryParam;
import com.mt.mapper.PmsProductCategoryAttributeRelationMapper;
import com.mt.mapper.PmsProductCategoryMapper;
import com.mt.mapper.PmsProductMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by 郭俊旺 on 2020/8/11 14:35
 *
 * @author 郭俊旺
 */
@Service
public class PmsProductCategoryService {
    @Autowired
    private PmsProductCategoryMapper categoryMapper;
    @Autowired
    private PmsProductCategoryAttributeRelationMapper relationMapper;
    @Autowired
    private PmsProductMapper pmsProductMapper;

    /**
     * 获取所有一级分类及其子分类
     * @return {@link List<PmsProductCategory>}
     */
    public List<PmsProductCategory> listWithChildren() {
       return  categoryMapper.listWithChildren();
    }

    public List<PmsProductCategory> getByParentId(Integer parentId,Integer pageNum,Integer pageSize) {
        QueryWrapper qw = new QueryWrapper();
        qw.eq("parent_id",parentId);
        qw.orderByDesc("sort");
        PageHelper.startPage(pageNum,pageSize);
        return categoryMapper.selectList(qw);
    }


    /**
     * 通过 id 得到商品分类详情
     * @param id id
     * @return {@link PmsProductCategory}
     */
    public PmsProductCategory getInfo(Integer id) {
        PmsProductCategory productCategory = categoryMapper.selectById(id);
        return productCategory;
    }

    @Transactional(propagation =  Propagation.REQUIRED)
    public int update(Long id, PmsProductCategoryParam productCategoryParam) {
        PmsProductCategory category = new PmsProductCategory();
        category.setId(id);
        BeanUtils.copyProperties(productCategoryParam,category);
        //设置category的等级
        setCategoryLevel(category);

        //根据id修改 商品信息表中的分类名
        UpdateWrapper updateProduct = new UpdateWrapper();
        updateProduct.set("product_category_name",category.getName());
        pmsProductMapper.update(null,updateProduct);


        //删除 分类 和参数的关系
        UpdateWrapper deleteProductCategory = new UpdateWrapper();
        deleteProductCategory.eq("product_category_id",category.getId());
        relationMapper.delete(deleteProductCategory);

        //如果有关系再添加
        if(CollectionUtil.isNotEmpty(productCategoryParam.getProductAttributeIdList())){
            List<Long> productAttributeIdList = productCategoryParam.getProductAttributeIdList();
            int  count = insertRelationList(category.getId(),productAttributeIdList);
        }
        //最后修改category
        return categoryMapper.updateById(category);
    }

    /**设置分类的等级*/
    private void setCategoryLevel(PmsProductCategory category){

       if(category==null) return;

        Long parentId = category.getParentId();

        if( parentId == null || parentId ==0){
            category.setLevel(0);
            return;
        }

        PmsProductCategory parent = categoryMapper.selectById(category.getParentId());

        if(parent == null){
            category.setLevel(0);
        }else{
            category.setLevel(1);
        }
    }

    /**
     * 批量插入商品分类和参数的关系
     * @return  影响函数
     * */
    public int insertRelationList(Long categoryId,List<Long> attributeIds){

        if(categoryId==null || CollectionUtil.isEmpty(attributeIds)) return 0;

        List<PmsProductCategoryAttributeRelation> relations = new ArrayList();
        //循环 封装数据
        for(Long attributeId : attributeIds){
            relations.add(new PmsProductCategoryAttributeRelation(null,categoryId,attributeId));
        }
        //批量插入
        return relationMapper.BatchInsert(relations);
    }

}
