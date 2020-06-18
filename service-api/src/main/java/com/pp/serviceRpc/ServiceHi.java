package com.pp.serviceRpc;

import com.pp.serviceapi.SchedualServiceHiApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: ppcloud
 * @description:
 * @author: Mr.Wang
 * @create: 2020-06-18 16:40
 **/
public class ServiceHi implements SchedualServiceHiApi {


    @Value("${server.port}")
    String port;

    public String sayHiFromClientOne(@RequestParam(value = "name", defaultValue = "pp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
