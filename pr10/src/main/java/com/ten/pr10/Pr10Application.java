package com.ten.pr10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Pr10Application {

	public static void main(String[] args) {
//		SpringApplication.run(Pr10Application.class, args);

	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

	Lighter lighter = context.getBean(Firefly.class);
	lighter.toLight();

	lighter = context.getBean(Flashlight.class);
	lighter.toLight();

	lighter = context.getBean(Lamp.class);
	lighter.toLight();
	}

}
