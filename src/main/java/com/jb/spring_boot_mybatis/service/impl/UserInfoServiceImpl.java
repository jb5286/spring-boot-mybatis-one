package com.jb.spring_boot_mybatis.service.impl;

import com.jb.spring_boot_mybatis.entity.UserInfoEntity;
import com.jb.spring_boot_mybatis.mapper.source1.UserInfoOneMapper;
import com.jb.spring_boot_mybatis.mapper.source2.UserInfoTwoMapper;
import com.jb.spring_boot_mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/20.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoOneMapper userInfoOneMapper;
    @Autowired
    private UserInfoTwoMapper userInfoTwoMapper;


    @Override
    public UserInfoEntity getOneUserById(Integer id) {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setId(id);
        UserInfoEntity entity1 = userInfoOneMapper.selectOne(entity);
        return entity1;
    }

    @Override
    public List<UserInfoEntity> getAllUserForOne() {
        List<UserInfoEntity> allUser = userInfoOneMapper.selectAll();
        return allUser;
    }

    @Override
    public UserInfoEntity getTwoUserById(Integer id) {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setId(id);
        UserInfoEntity entity1 = userInfoTwoMapper.selectOne(entity);
        return entity1;
    }

    @Override
    public List<UserInfoEntity> getAllUserForTwo() {
        List<UserInfoEntity> allUser = userInfoTwoMapper.selectAll();
        return allUser;
    }
}
