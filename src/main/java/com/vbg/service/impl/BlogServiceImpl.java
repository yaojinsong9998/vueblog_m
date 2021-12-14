package com.vbg.service.impl;

import com.vbg.entity.Blog;
import com.vbg.mapper.BlogMapper;
import com.vbg.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
