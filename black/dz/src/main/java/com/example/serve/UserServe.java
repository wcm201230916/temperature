package com.example.serve;

import com.example.entry.User;

/**
 * @Author:马薪章
 * @Version:1.0
 **/
public interface UserServe {
    User login(User user);

    void save(User user);
}
