package com.mt;

import com.baomidou.mybatisplus.annotation.TableId;
import com.mt.bean.UmsAdmin;
import com.mt.bean.UmsResource;
import com.mt.mapper.UmsAdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Test1 {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Test
    public  void test(){
        List<UmsResource> allResource = umsAdminMapper.getAllResource();
        System.out.println(allResource);

    }
}
