package com.mt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.github.pagehelper.PageHelper;
import com.mt.bean.PmsBrand;
import com.mt.mapper.PmsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;


    /**
     * 查询品牌信息
     *
     * @param keyword  关键字
     * @param pageNum  页面num
     * @param pageSize 页面大小
     * @return {@link List<PmsBrand>}
     */
    public List<PmsBrand> getList(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper qw = new QueryWrapper();

        if(StringUtils.isNotBlank( keyword)){
            qw.like("name",keyword);
        }
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectList(qw);
    }
}
