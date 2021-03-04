package com.example.sqlserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * (Book)实体类
 *
 * @author arte
 * @since 2021-03-04 15:58:48
 */
@Data
public class Book {
    private static final long serialVersionUID = 773845662262131996L;
    /**
     * 主键id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 简介
     */
    private String description;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 书名
     */
    private String name;

    /**
     * 价格
     */
    private Double price;

    /**
     * 出版社
     */
    private String publisher;

}