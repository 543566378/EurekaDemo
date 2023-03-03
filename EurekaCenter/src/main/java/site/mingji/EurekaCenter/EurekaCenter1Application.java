package site.mingji.EurekaCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCenter1Application {

	public static void main(String[] args) {
		System.out.println("补丁测试");
		//分支合并测试
		SpringApplication.run(EurekaCenter1Application.class, args);
		
	}
}
