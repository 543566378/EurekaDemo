package site.mingji.EurekaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.mingji.EurekaConsumer.server.TestServer;

@RestController
public class ConsumerController {

	@Autowired
	TestServer server;
	
    @GetMapping("/rpc")
    public String rpc() {
    	return server.test();
    }
}
