package com.caochengyin.service;

import com.caochengyin.model.UserInfo;

import java.util.List;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/28 0028
 * @description 用户信息服务接口
 */
public interface UserInfoService {
    /**
     * 获取所有有效的用户信息
     *
     * @return 有效用户信息集合
     */
    List<UserInfo> getAllUserInfo();
}
