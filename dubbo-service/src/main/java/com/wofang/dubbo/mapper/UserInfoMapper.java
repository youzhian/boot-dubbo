package com.wofang.dubbo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wofang.dubbo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
