package com.zyziek055.spring_boot_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Store {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Store.class, args);
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User( "aaa", "aaa", "aaa"));

	}

}
