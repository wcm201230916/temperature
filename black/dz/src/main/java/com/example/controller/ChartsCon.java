package com.example.controller;

import com.example.entry.Result;
import com.example.entry.Table;
import com.example.serve.charts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@RestController
@Component
@RequestMapping("/dz")
public class ChartsCon {
    @Autowired
    private charts c;
    @GetMapping("/chart")
    public Result get(){
        List<Integer> temp=new ArrayList<>();
        List<Table> ta=c.list();
        for (Table t:ta){
            temp.add(t.getT());
        }
        return Result.success(temp);
    }
}
