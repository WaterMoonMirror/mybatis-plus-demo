package com.tkn.mybatisplusdemo.test_mybatis_plus.service.impl;

import com.tkn.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.tkn.mybatisplusdemo.test_mybatis_plus.entity.User;
import com.tkn.mybatisplusdemo.test_mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest extends MybatisPlusDemoApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void testVersion() {
        User user = new User();
        user.setName("tom").setAge(20).setEmail("tom@163.com");
        userService.save(user);
        userService.list().forEach(System.out::println);
        user.setName("jarry1");
        userService.update(user, null);
        userService.list().forEach(System.out::println);
        user.setName("jarry2");
        userService.update(user, null);
        userService.list().forEach(System.out::println);
        user.setName("jarry3");
        userService.update(user, null);
        userService.list().forEach(System.out::println);
    }

}
