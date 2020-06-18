package com.pp.serviceapi;

import org.springframework.stereotype.Component;

/**
 * @Author BG388235
 * @create 2019/11/8 14:21
 */
@Component
public class SchedualServiceHiApiHystric implements SchedualServiceHiApi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
