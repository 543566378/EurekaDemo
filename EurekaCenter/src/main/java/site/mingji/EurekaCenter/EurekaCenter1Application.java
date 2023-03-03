package site.mingji.EurekaCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//测试冲突合并解决
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenter1Application {

	public static void main(String[] args) {
		System.out.println("补丁测试");
		//分支合并测试
		//测试可否临时修改合并结果
		
		//后来发现推送不了，很乱

//再试试
		SpringApplication.run(EurekaCenter1Application.class, args);
		//本地修改

//测试merge
	}
	
	
}
