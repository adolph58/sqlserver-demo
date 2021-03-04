package com.example.sqlserver.service;

import com.example.sqlserver.entity.Book;

/**
 * (Book)表服务接口
 *
 * @author arte
 * @since 2021-03-04 15:58:48
 */
public interface BookService extends BaseService<Book> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Book queryById(Long id);

    /**
     * 新增数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    Book insert(Book book);

    /**
     * 修改数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    Book update(Book book);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}