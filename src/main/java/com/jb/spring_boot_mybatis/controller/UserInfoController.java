package com.jb.spring_boot_mybatis.controller;

import com.jb.spring_boot_mybatis.entity.UserInfoEntity;
import com.jb.spring_boot_mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/9/20.
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/getOneUserById")
    public UserInfoEntity getOneUserById(Integer id){
        return userInfoService.getOneUserById(id);
    }

    @RequestMapping("/getAllUserForOne")
    public List<UserInfoEntity> getAllUserForOne(){
        return userInfoService.getAllUserForOne();
    }

    @RequestMapping("/getTwoUserById")
    public UserInfoEntity getTwoUserById(Integer id){
        return userInfoService.getTwoUserById(id);
    }

    @RequestMapping("/getAllUserForTwo")
    public List<UserInfoEntity> getAllUserForTwo(){
        return userInfoService.getAllUserForTwo();
    }
}
