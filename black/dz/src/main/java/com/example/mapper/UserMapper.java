package com.example.mapper;

import com.example.entry.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password}")
    User login(User user);
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void save(User user);
}
