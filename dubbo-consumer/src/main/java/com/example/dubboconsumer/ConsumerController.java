package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author willmu
 * @date 2020/11/19 20:00
 */
@RestController
public class ConsumerController {
    @Reference
    private ApiService apiService;

    @GetMapping("/say")
    public String get(String name){
        return apiService.say(name);
    }
}
