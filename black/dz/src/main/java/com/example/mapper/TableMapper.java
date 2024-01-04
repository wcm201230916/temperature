package com.example.mapper;

import com.example.entry.Table;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Mapper
public interface TableMapper {
    @Select("select * from data")
    List<Table> all();
    @Delete("delete from data where id=#{id}")
    void deleteById(Integer id);
    @Insert("insert into data (t) values (#{t})")
    void Insert(Table table);

    void deleteall(@Param("ids") List<Integer> ids);

    void updata(Table table);
    @Select("select t,id from data where id=#{id}")
    Table GetById(Integer id);
}
