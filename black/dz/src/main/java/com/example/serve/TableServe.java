package com.example.serve;

import com.example.entry.Table;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
public interface TableServe {
    List<Table> selectall();

    void deleteid(Integer id);

    void insert(Table table);


    void deleteall(List<Integer> ids);

    void updata(Table table);

    Table GetById(Integer id);
}
