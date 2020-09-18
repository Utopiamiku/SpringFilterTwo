package com.miku.test;

import com.miku.pojo.UserInfo;
import com.miku.service.IUserService;
import com.miku.service.impl.UserServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author: Utopiamiku
 * @date: 2020/9/17 11:29
 * @description:
 */
public class Test {
    public static void main(String[] args) {
//        IUserService userService = new UserServiceImpl();
//        UserInfo userInfo = userService.userTest();
//        System.out.println(userInfo);

        BCryptPasswordEncoder ps = new BCryptPasswordEncoder();
        System.out.println(ps.encode("123456"));
//        System.out.println(ps.matches("hello", "$2a$10$S4ZO6GtJJqss0bE/wsUp3uBZTb/.59nOyb6s9rrcUa7y3tw7GasDO"));

    }
}
