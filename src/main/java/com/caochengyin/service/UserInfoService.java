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

    /**
     * 根据主键id更新用户名称信息
     *
     * @param userInfo 主键id,用户名称信息
     * @return 数据库受影响条数
     */
    int updateNameById(UserInfo userInfo);

    /**
     * 根据主键id获取用户信息
     *
     * @param id 主键id
     * @return 用户信息
     */
    UserInfo getUserInfoById(Long id);
}
