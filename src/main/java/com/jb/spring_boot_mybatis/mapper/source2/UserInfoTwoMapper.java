package com.jb.spring_boot_mybatis.mapper.source2;

import com.jb.spring_boot_mybatis.entity.UserInfoEntity;
import com.jb.spring_boot_mybatis.util.CommnMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/20.
 */
@Component
@Mapper
public interface UserInfoTwoMapper extends CommnMapper<UserInfoEntity> {
}
