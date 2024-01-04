package com.example.controller;

import com.example.entry.Result;
import com.example.entry.Table;
import com.example.entry.User;
import com.example.serve.TableServe;
import com.example.serve.UserServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@RestController
@Component
@RequestMapping("/dz")
public class TableCon {
    @Autowired
    private TableServe tableServe;
    //查询所有表数据
    @GetMapping("/selectall")
    public Result list(){
        List<Table> tablelist=tableServe.selectall();
        return Result.success(tablelist);
    }
    //根据id删除数据方法
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        tableServe.deleteid(id);
        return Result.success();
    }
    //添加温度信息
    @PutMapping("/savetemp")
    public Result save(@RequestBody Table table){
        tableServe.insert(table);
        return Result.success();
    }
    //批量删除
    @DeleteMapping("/deleteall/{ids}")
    public Result deleteall(@PathVariable List<Integer> ids){
        tableServe.deleteall(ids);
        return Result.success();
    }
    @PutMapping("/update")
    public Result deleteall(@RequestBody Table table){
        tableServe.updata(table);
        return Result.success();
    }
    //回显
    @GetMapping("/go/{id}")
    public Result GetById(@PathVariable Integer id){
        Table t=tableServe.GetById(id);
        return Result.success(t);
    }

}
