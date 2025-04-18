package com.zyziek055.spring_boot_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootBasicsApplication.class, args);
		var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
