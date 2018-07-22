package com.caochengyin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Cao Chengyin
 * @version v 1.0.0
 * @date 2018/7/22 0022
 * @description 配置信息实体类
 */
@Component
@ConfigurationProperties(prefix = "my.profile")
public class ConfigInfo {
    private String first;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
