package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by hb on 2018/8/21.
 */

// 属性配置类
// 读取配置文件
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
