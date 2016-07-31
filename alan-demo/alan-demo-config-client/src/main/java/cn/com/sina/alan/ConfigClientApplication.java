package cn.com.sina.alan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${spring.datasource.username}")
	String name = "World";

	@RequestMapping("/")
	public String home() {
		System.out.println(name);
		return name;
	}	

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);

	}
}
