package com.tkn.mybatisplusdemo.test_mybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tkn.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.tkn.mybatisplusdemo.test_mybatis_plus.entity.User;
import com.tkn.mybatisplusdemo.test_mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void insertbath() {
        List<User> users=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(new User().setName("name"+i).setEmail("163@qq.com"));
        }
        userService.saveBatch(users);
    }
    @Test
    public void insert() {
        userService.save(new User().setName("name").setEmail("163@qq.com"));
    }
    @Test
    public void testPage() {
        // Step1：创建一个 Page 对象
        Page<User> page = new Page<>();
        // Page<User> page = new Page<>(2, 5);
        // Step2：调用 mybatis-plus 提供的分页查询方法
        userService.page(page, null);
        // Step3：获取分页数据
        System.out.println(page.getCurrent()); // 获取当前页
        System.out.println(page.getTotal()); // 获取总记录数
        System.out.println(page.getSize()); // 获取每页的条数
        System.out.println(page.getRecords()); // 获取每页数据的集合
        System.out.println(page.getPages()); // 获取总页数
        System.out.println(page.hasNext()); // 是否存在下一页
        System.out.println(page.hasPrevious()); // 是否存在上一页
    }
}
