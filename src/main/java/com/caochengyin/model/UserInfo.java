package com.caochengyin.model;

import lombok.*;

import java.util.Date;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/28 0028
 * @description 用户信息实体类
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserInfo {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 记录是否有效
     */
    private Integer isDelete;
    /**
     * 记录创建者
     */
    private String createUser;
    /**
     * 记录创建时间
     */
    private Date createTime;
    /**
     * 记录更新者
     */
    private String updateUser;
    /**
     * 记录更新时间
     */
    private Date updateTime;
    /**
     * 时间戳
     */
    private Date ts;
}
