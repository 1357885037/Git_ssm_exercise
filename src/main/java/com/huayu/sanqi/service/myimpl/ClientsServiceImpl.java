package com.huayu.sanqi.service.myimpl;

import com.huayu.sanqi.entity.Clients;
import com.huayu.sanqi.mapper.ClientsMapper;
import com.huayu.sanqi.service.IClientsService;
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
public class ClientsServiceImpl extends ServiceImpl<ClientsMapper, Clients> implements IClientsService {

}
