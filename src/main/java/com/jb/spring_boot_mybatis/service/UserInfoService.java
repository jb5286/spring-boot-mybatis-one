package com.jb.spring_boot_mybatis.service;

import com.jb.spring_boot_mybatis.entity.UserInfoEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/9/20.
 */
public interface UserInfoService {

    public UserInfoEntity getOneUserById(Integer id);

    public List<UserInfoEntity> getAllUserForOne();

    public UserInfoEntity getTwoUserById(Integer id);

    public List<UserInfoEntity> getAllUserForTwo();
}
