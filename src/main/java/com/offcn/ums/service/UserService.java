package com.offcn.ums.service;

import com.offcn.ums.bean.User;

import java.util.List;

/**
 * @program: ums
 * @description:
 * @author: Mr.C
 * @create: 2020-01-12 21:04
 **/
public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(Long id,User user);
    //删除指定id用户
    public void deleteUser(Long id);

}
