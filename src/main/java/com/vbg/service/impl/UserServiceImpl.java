package com.vbg.service.impl;

import com.vbg.entity.User;
import com.vbg.mapper.UserMapper;
import com.vbg.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yaojinsong
 * @since 2021-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
