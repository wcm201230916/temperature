package com.example.serve.Impl;

import com.example.entry.Table;
import com.example.mapper.chartsMapper;
import com.example.serve.charts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@Service
public class chartsImpl implements charts {
    @Autowired
    private chartsMapper ch;
    @Override
    public List<Table> list() {
        return ch.getTemp();
    }
}
