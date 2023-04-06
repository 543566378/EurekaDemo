package site.mingji.EurekaConsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import site.mingji.EurekaConsumer.config.FeignConfiguration1;
import site.mingji.EurekaConsumer.config.FeignConfiguration2;

@FeignClient(value = "Eureka-Provider1", configuration = FeignConfiguration2.class)
public interface TestServer {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();

}