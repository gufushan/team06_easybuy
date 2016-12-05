package com.ibeifeng.shop.service;

import com.ibeifeng.shop.model.User;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/12/3.
 */
public interface IUserService {
    //用户登录方法
    String login(String username, String password, HttpSession session);
    void update(User user);
    void add(User user,HttpSession session);
    String searchusername(String username);
}
