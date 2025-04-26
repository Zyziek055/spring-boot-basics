package com.zyziek055.spring_boot_basics;

import com.zyziek055.spring_boot_basics.entities.User;
import com.zyziek055.spring_boot_basics.repositories.UserRepository;
import com.zyziek055.spring_boot_basics.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Store {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Store.class, args);
			var service = context.getBean(UserService.class);
			service.fetchProducts();
	}
}
