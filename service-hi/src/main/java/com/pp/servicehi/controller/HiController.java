package com.pp.servicehi.controller;

import com.pp.serviceapi.SchedualServiceHiApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: ppcloud
 * @description:
 * @author: Mr.Wang
 * @create: 2020-06-18 16:45
 **/


public class HiController {


    @Autowired
    private SchedualServiceHiApi schedualServiceHiApi;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "pp") String name) {
        return schedualServiceHiApi.sayHiFromClientOne(name);
    }
}
