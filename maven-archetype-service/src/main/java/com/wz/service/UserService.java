package com.wz.service;

import com.wz.common.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Service示例
 * Created by wangzi on 2017-08-01.
 */
public class UserService {
    private List<User> list;
    {
        list = new ArrayList();
        list.add(new User(1, "wang"));
        list.add(new User(2, "zhang"));
    }
    public List<User> getAllUsers(){
        return list;
    }
}
