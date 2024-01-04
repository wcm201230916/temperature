package com.example.mapper;

import com.example.entry.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Mapper
public interface chartsMapper {
    @Select("select t from data")
    List<Table> getTemp();
}
