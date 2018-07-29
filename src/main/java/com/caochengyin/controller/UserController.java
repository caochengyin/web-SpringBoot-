package com.caochengyin.controller;

import com.caochengyin.model.UserInfo;
import com.caochengyin.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/28 0028
 * @description 用户信息Controller
 */
@Slf4j
@RestController
@RequestMapping(value = {"/user"})
public class UserController {
    /**
     * 日志前缀
     */
    private static String LOG_PREFIX = "用户信息===>";

    @Resource(name = "userInfoService")
    private UserInfoService userInfoService;

    @GetMapping(value = {"/getAll"})
    public List<UserInfo> getAllUser() {
        log.info("{}开始获取当前数据库中所有有效用户信息!", LOG_PREFIX);
        return userInfoService.getAllUserInfo();
    }

    @RequestMapping(value = {"/updateUserNameById"}, method = {RequestMethod.GET})
    public String updateUserNameById() {
        Long id = 1L;
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserName("吴彦祖-update");
        int count = userInfoService.updateNameById(userInfo);
        return "数据库受影响条数为:" + count;
    }

    @RequestMapping(value = {"/updateUserNameById/{id}/{name}"}, method = {RequestMethod.GET})
    public UserInfo updateUserNameById(@PathVariable(name = "id") Long id, @PathVariable(name = "name") String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserName(name);
        //根据id更新数据库信息
        int count = userInfoService.updateNameById(userInfo);
        //根据id获取用户信息
        return userInfoService.getUserInfoById(id);
    }
}
