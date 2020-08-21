package com.tarnet.services.hello;

import com.tarnet.common.serviceInterfaces.IGreetingService;

public class HelloService implements IGreetingService {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String say(String name) {
        return "Hello " + name;
    }
}
