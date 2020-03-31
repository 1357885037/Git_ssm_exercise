package com.hy.ssm.exercise.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.ssm.exercise.entity.users;
import com.hy.ssm.exercise.mapper.BookMapper;
import com.hy.ssm.exercise.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
@Transactional
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, users> implements IBookService {

    @Autowired
    private BookMapper bookMapper;


    public Set<String> roles(String user){
        HashSet<String> set=bookMapper.roles(user);
        return set;
    }

    public Set<String> users_jurisdiction(String user){
        HashSet<String> set=bookMapper.users_jurisdiction(user);
        return set;
    }
    public Set<String> users_jurisdiction2(String user){
        HashSet<String> set=bookMapper.users_jurisdiction2(user);
        return set;
    }


}
