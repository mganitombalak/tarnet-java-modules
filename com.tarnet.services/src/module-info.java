import com.tarnet.common.serviceInterfaces.IGreetingService;
import com.tarnet.services.hello.HelloService;
import com.tarnet.services.hi.HiService;
open module com.tarnet.services {
    requires com.tarnet.common;
    provides IGreetingService with HelloService,HiService;
    // opens com.tarnet.services;// to specific.package;
//    provides ICreditApplication with KKBScoreService
//    provides ICreditApplication with CariScoreService
}