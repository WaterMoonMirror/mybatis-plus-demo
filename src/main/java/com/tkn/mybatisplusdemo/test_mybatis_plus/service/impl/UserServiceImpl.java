package com.tkn.mybatisplusdemo.test_mybatis_plus.service.impl;

import com.tkn.mybatisplusdemo.test_mybatis_plus.entity.User;
import com.tkn.mybatisplusdemo.test_mybatis_plus.mapper.UserMapper;
import com.tkn.mybatisplusdemo.test_mybatis_plus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyh
 * @since 2022-03-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
