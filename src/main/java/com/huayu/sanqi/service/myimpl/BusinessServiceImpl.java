package com.huayu.sanqi.service.myimpl;

import com.huayu.sanqi.entity.Business;
import com.huayu.sanqi.mapper.BusinessMapper;
import com.huayu.sanqi.service.IBusinessService;
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
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

}
