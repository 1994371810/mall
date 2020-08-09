package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 相册表(PmsAlbum)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsAlbum implements Serializable {
    private static final long serialVersionUID = -87100599886549302L;
    
    private Long id;
    
    private String name;
    
    private String coverPic;
    
    private Integer picCount;
    
    private Integer sort;
    
    private String description;



}