package com.example.serve.Impl;

import com.example.entry.Table;
import com.example.mapper.TableMapper;
import com.example.serve.TableServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Service
public class TableImpl implements TableServe {
    @Autowired
    private TableMapper tableMapper;

    @Override
    public List<Table> selectall() {
        return tableMapper.all();
    }

    @Override
    public void deleteid(Integer id) {
        tableMapper.deleteById(id);
    }

    @Override
    public void insert(Table table) {
        tableMapper.Insert(table);
    }

    @Override
    public void deleteall(List<Integer> ids) {
            tableMapper.deleteall(ids);
    }

    @Override
    public void updata(Table table) {
        tableMapper.updata(table);
    }

    @Override
    public Table GetById(Integer id) {
        return tableMapper.GetById(id);
    }
}
