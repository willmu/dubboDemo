package com.example.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.ApiService;

/**
 * @author willmu
 * @date 2020/11/19 19:00
 */
@Service
public class ProviderServiceImpl implements ApiService {

    @Override
    public String say(String hello) {
        return "Hello:"+hello;
    }
}
