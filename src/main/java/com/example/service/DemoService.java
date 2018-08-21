package com.example.service;

/**
 * Created by Administrator on 2018/8/21.
 */
public class DemoService {
    private String prefix;
    private String suffix;

    public DemoService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
