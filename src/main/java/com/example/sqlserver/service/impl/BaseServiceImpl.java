package com.example.sqlserver.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sqlserver.service.BaseService;

/**
 * 基础 Service 实现类
 *
 * @author Arte
 * @create 2020/5/20 17:45
 **/
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

}
