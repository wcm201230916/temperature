package com.example.controller;

import com.example.entry.Result;
import com.example.entry.User;
import com.example.serve.UserServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
@RestController
@Component
@RequestMapping("/dz")
public class Ucon {
    @Autowired
    private UserServe userServe;
    //登录方法
    @PostMapping("/l")
    public Result login(@RequestBody User user){
        User u=userServe.login(user);
        if (u !=null){
            return Result.success(u);
        }
        return Result.error("登录失败");
    }
    //注册方法
    @PutMapping("/save")
    public Result save(@RequestBody User user){
        userServe.save(user);
        return Result.success();
    }
}
