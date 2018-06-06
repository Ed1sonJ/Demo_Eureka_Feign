package com.dxj.servicehi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by duxiji on 2018/6/5
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return helloService.hi(name);
    }
}
