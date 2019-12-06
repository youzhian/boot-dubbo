package com.wofang.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wofang.dubbo.mapper.UserInfoMapper;
import com.wofang.dubbo.model.UserInfo;
import com.wofang.dubbo.service.usi.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author youzhian
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
}
