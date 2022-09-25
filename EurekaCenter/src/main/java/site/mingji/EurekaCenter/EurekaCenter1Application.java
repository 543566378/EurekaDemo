package site.mingji.EurekaCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCenter1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCenter1Application.class, args);
	}
}
