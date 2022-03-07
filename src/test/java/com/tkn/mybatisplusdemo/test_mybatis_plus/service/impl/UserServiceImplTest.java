package com.tkn.mybatisplusdemo.test_mybatis_plus.service.impl;

import com.tkn.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.tkn.mybatisplusdemo.test_mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest extends MybatisPlusDemoApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void testDelete() {
        if (userService.removeById(1258924257048547329L)) {
            System.out.println("删除数据成功");
            userService.list().forEach(System.out::println);
        } else {
            System.out.println("删除数据失败");
        }
    }
}
