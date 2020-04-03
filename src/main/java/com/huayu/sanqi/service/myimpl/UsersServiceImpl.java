package com.huayu.sanqi.service.myimpl;

import com.huayu.sanqi.entity.Users;
import com.huayu.sanqi.mapper.UsersMapper;
import com.huayu.sanqi.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TH
 * @since 2020-04-03
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
