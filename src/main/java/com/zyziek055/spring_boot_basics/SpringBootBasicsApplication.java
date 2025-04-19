package com.zyziek055.spring_boot_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootBasicsApplication.class, args);
		var notificationService = context.getBean(NotificationManager.class);
		notificationService.sendNotification("'this is the message'");
	}

}
