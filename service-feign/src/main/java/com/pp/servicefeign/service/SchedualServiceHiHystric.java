package com.pp.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author BG388235
 * @create 2019/11/8 14:21
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
