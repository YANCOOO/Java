package com.dao;
//持久层接口

import com.source.mybatisMain;

import java.util.List;

public interface mybatisMainDao {
//查询所有
    List<mybatisMain> findAll();
}
