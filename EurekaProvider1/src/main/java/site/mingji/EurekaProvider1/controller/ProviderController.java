package site.mingji.EurekaProvider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/test")
	public String test() {
		return "测试成功啦啦啦啦啦啦";
	}

}