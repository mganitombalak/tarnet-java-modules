package com.tarnet.client;

import com.tarnet.common.serviceInterfaces.IGreetingService;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class TarnetClient {

    public static void main(String[] args) {
        List<ServiceLoader.Provider<IGreetingService>> services =
                ServiceLoader.load(IGreetingService.class)
                .stream().sorted().collect(Collectors.toList());
        services.forEach(s-> System.out.println(s.say("Gani")));
//        System.out.println(services.iterator().next().say("Gani"));
    }
}
