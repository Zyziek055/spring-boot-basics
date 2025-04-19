package com.zyziek055.spring_boot_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBasicsApplication.class, args);
		var resource = context.getBean(HeavyResource.class);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
		context.close();
	}

}
