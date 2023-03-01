package site.mingji.EurekaConsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("Eureka-Provider1")
public interface TestServer {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test();

}