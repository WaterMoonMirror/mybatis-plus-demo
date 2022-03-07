package com.tkn.mybatisplusdemo.test_mybatis_plus.service.impl;

import com.tkn.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.tkn.mybatisplusdemo.test_mybatis_plus.entity.User;
import com.tkn.mybatisplusdemo.test_mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest extends MybatisPlusDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testUpdate() {
        User user = new User();
        user.setName("tom").setAge(20).setEmail("tom@163.com");
        // 手动添加数据
        user.setCreateTime(new Date()).setUpdateTime(new Date());
        if (userService.save(user)) {
            userService.list().forEach(System.out::println);
        } else {
            System.out.println("添加数据失败");
        }
    }
    @Test
    public void testAutoFill() {
        User user = new User();
        user.setName("tom").setAge(20).setEmail("tom@163.com");
        if (userService.save(user)) {
            userService.list().forEach(System.out::println);
        } else {
            System.out.println("添加数据失败");
        }
    }
}
