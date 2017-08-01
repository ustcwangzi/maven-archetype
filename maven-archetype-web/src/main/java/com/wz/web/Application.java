package com.wz.web;

import com.wz.service.UserService;

/**
 * Created by wangzi on 2017-08-01.
 */
public class Application {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.getAllUsers().forEach(u -> System.out.println(u));
    }
}
