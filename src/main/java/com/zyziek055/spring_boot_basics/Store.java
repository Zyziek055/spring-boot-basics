package com.zyziek055.spring_boot_basics;

import com.zyziek055.spring_boot_basics.entities.Address;
import com.zyziek055.spring_boot_basics.entities.Profile;
import com.zyziek055.spring_boot_basics.entities.Tag;
import com.zyziek055.spring_boot_basics.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Store {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Store.class, args);
		var user = User.builder().name("John").email("<EMAIL>").password("<PASSWORD>").build();

		var profile = Profile.builder().bio("I am a developer").build();

		user.setProfile(profile);
		profile.setUser(user);

		System.out.println(user);
	}

}
