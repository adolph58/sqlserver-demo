package com.example.sqlserver.controller;

import com.example.sqlserver.Result;
import com.example.sqlserver.entity.Book;
import com.example.sqlserver.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Book)表控制层
 *
 * @author arte
 * @since 2021-03-04 15:58:48
 */
@RestController
@RequestMapping("/book")
public class BookController {
    /**
     * 服务对象
     */
    @Autowired
    private BookService bookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public Result selectOne(@PathVariable("id") Long id) {
        return Result.success(this.bookService.queryById(id));
    }
    
    /**
     * 新增一条数据
     */
    @PostMapping("/save")
    public Result save(@RequestBody Book book) {
        return Result.success(this.bookService.insert(book));
    }
    
    /**
     * 修改数据
     */
    @PostMapping("/update")
    public Result update(@RequestBody Book book) {
        return Result.success(this.bookService.update(book));
    }
    
    /**
     * 通过主键删除单条数据
     * @param id 主键
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Long id) {
        return Result.success(this.bookService.deleteById(id));
    }

}