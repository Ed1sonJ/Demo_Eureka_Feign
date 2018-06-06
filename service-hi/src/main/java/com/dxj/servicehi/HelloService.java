package com.dxj.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Create by duxiji on 2018/6/5
 */
@Service
public class HelloService {
    @Value("${server.port}")
    String port;

    public String hi(String name) {
        return "i am" + name + "my port is" + port;
    }
}
