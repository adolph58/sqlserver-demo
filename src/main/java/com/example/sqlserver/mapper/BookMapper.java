package com.example.sqlserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sqlserver.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * (Book)表数据库访问层
 *
 * @author arte
 * @since 2021-03-04 15:58:48
 */
@Repository
public interface BookMapper extends BaseMapper<Book>{

}