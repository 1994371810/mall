package com.mt;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mt.bean.PmsProductAttributeCategory;
import com.mt.bean.UmsAdmin;
import com.mt.bean.UmsResource;
import com.mt.dao.PmsProductAttributeCategoryDao;
import com.mt.dto.PmsProductAttributeCategoryItem;
import com.mt.mapper.UmsAdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Test1 {
    @Autowired
    private PmsProductAttributeCategoryDao dao;

    @Test
    public void test1(){
        List<PmsProductAttributeCategoryItem> pmsProductAttributeCategoryItems = dao.selectWithAttr();
        System.out.println(pmsProductAttributeCategoryItems);


    }
}
