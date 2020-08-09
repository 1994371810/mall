package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 画册图片表(PmsAlbumPic)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsAlbumPic implements Serializable {
    private static final long serialVersionUID = 994208405353995933L;
    
    private Long id;
    
    private Long albumId;
    
    private String pic;



}