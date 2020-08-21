package com.tarnet.services.hi;

import com.tarnet.common.serviceInterfaces.IGreetingService;

public class HiService implements IGreetingService {
    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public String say(String name) {
        return "Hi "+ name;
    }

//    public void run(CreditApplicationModel model) {
//            model.applicationType==Channel.SMS
//    }
}
