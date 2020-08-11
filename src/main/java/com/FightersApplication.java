package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages="com")
@EntityScan(basePackages="com.fighters")
@EnableJpaRepositories("com.crud")
public class FightersApplication {

	public static void main(String[] args) {
		SpringApplication.run(FightersApplication.class, args);
	}

}
