package com.caochengyin.service.impl;

import com.caochengyin.dao.UserInfoDao;
import com.caochengyin.model.UserInfo;
import com.caochengyin.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/28 0028
 * @description 用户信息服务接口实现类
 */
@Service(value = "userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> getAllUserInfo() {
        return userInfoDao.getAllUserInfo();
    }
}
