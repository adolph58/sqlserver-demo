package com.example.sqlserver;

import com.example.sqlserver.entity.Book;
import com.example.sqlserver.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SqlserverDemoApplicationTests {

    @Autowired
    BookService bookService;

    /**
     * 查询一条数据
     */
    @Test
    void queryById() {
        Book book = bookService.queryById(1L);
        System.out.println(book.toString());
    }

    /**
     * 增加一条数据
     */
    @Test
    void insert() {
        Book book = new Book();
        book.setName("三体5");
        book.setPrice(58.00);
        book.setPublisher("重庆出版社");
        book.setDescription("刘慈欣雨果奖作品");
        book.setGmtCreate(new Date());
        book.setGmtModified(new Date());
        bookService.insert(book);
    }

    /**
     * 修改一条数据
     */
    @Test
    void update() {
        Book book = bookService.queryById(1L);
        book.setPrice(88.00);
        book.setGmtModified(new Date());
        bookService.update(book);
    }

    /**
     * 增加一条数据
     */
    @Test
    void delete() {
        bookService.deleteById(3L);
    }
}
