package com.mt.dao;

import com.mt.dto.PmsProductAttributeCategoryItem;
import com.mt.mapper.PmsProductAttributeCategoryMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface PmsProductAttributeCategoryDao extends PmsProductAttributeCategoryMapper {


    List<PmsProductAttributeCategoryItem> selectWithAttr();
}
