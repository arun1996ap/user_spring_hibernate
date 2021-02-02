package com.britly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.britly.repository")
@SpringBootApplication
public class UserSpringHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSpringHibernateApplication.class, args);
	}

}
