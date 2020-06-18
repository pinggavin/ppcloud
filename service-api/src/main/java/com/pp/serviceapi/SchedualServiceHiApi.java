package com.pp.serviceapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: ppcloud
 * @description:
 * @author: Mr.Wang
 * @create: 2020-06-18 16:30
 **/

@FeignClient(value = "service-hi", fallback = SchedualServiceHiApiHystric.class)
public interface SchedualServiceHiApi {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
