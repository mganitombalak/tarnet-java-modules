package com.tarnet.client;

import com.tarnet.common.serviceInterfaces.IGreetingService;

import java.util.Comparator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class TarnetClient {

    public static void main(String[] args) {
        // com.tarnet.flowModel.CreditApplicationModel m = new ,,,,,
        List<IGreetingService> services =
                ServiceLoader.load(IGreetingService.class)
                        .stream().map(s->s.get())
                        .sorted(Comparator.comparingInt(value -> value.getOrder()))
                        .collect(Collectors.toList());
        services.forEach(s-> System.out.println(s.say("Gani")));

    }
}
