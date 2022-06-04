package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp1=context.getBean("empBean",Employee.class);
		System.out.println(emp1.getId()+ " "+ emp1.getName());
		System.out.println(emp1.getAddress().getResid_add()+ " "+ emp1.getAddress().getPin());
		
	}

}
