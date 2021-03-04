package com.example.sqlserver.service.impl;

import com.example.sqlserver.entity.Book;
import com.example.sqlserver.mapper.BookMapper;
import com.example.sqlserver.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Book)表服务实现类
 *
 * @author arte
 * @since 2021-03-04 15:58:48
 */
@Service("bookService")
public class BookServiceImpl extends BaseServiceImpl<BookMapper, Book> implements BookService {
    
    @Autowired
    private BookMapper bookMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Book queryById(Long id) {
        return this.bookMapper.selectById(id);
    }

    /**
     * 新增数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    @Override
    public Book insert(Book book) {
        this.bookMapper.insert(book);
        return book;
    }

    /**
     * 修改数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    @Override
    public Book update(Book book) {
        this.bookMapper.updateById(book);
        return this.queryById(book.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.bookMapper.deleteById(id) > 0;
    }
}