import com.tarnet.common.serviceInterfaces.IGreetingService;
import com.tarnet.services.hello.HelloService;
import com.tarnet.services.hi.HiService;

module com.tarnet.services {
    requires com.tarnet.common;
    provides IGreetingService with HelloService,HiService;
//    provides ICreditApplication with KKBScoreService
//    provides ICreditApplication with CariScoreService
}