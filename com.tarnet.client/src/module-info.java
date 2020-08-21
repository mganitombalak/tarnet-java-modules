import com.tarnet.common.serviceInterfaces.IGreetingService;

module com.tarnet.client {
        requires com.tarnet.common;
        requires com.tarnet.services;
        uses com.tarnet.common.serviceInterfaces.IGreetingService;
        // RUNTIME & COMPILE DEPENDENCY
//        exports com.tarnet.hr; ONLY ONE MODULE CAN EXPORT CANNOT SPLIT PACKAGE
//        YOU CAN'T MAKE A CIRCULAR DEPENDECY
}