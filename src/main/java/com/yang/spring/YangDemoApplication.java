package com.yang.spring;

import com.yang.spring.LogController.LogController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YangDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(YangDemoApplication.class, args);
		LogController logController = context.getBean(LogController.class);
		System.out.println(logController.toString());
	}
}
