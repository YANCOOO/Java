package com.dao;
//持久层接口

import com.source.mybatisMain;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface mybatisMainDao {
    //    查询
    //    select last_insert_id查询最后插入的id 使用标签<selectkey order = after >
    //    在插入数据后执行
    @Select("SELECT * FROM user")
    List<mybatisMain> findAll();

    //    插入
    @Insert("INSERT INTO user(id,username,birthday,sex,adress) VALUES(#{id},#{username},#{birthday},#{sex},#{adress})")
    void insertDb(mybatisMain mybatisMain);

    //    更新
    @Update("UPDATE user SET username=#{username} where id=#{id}")
    void updateDb(mybatisMain mybatisMain);

    //    删除
    @Delete("DELETE FROM user WHERE id=#{id}")
    void deleteDb(mybatisMain mybatisMain);

}

