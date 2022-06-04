package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Employee empBean() {
		Employee emp=new Employee();
		emp.setId(1000);
		emp.setName("Saurav Mehare");
		emp.setAddress(addBean());
		return emp;
	}
	
	@Bean	
	public Address addBean(){
		Address add=new Address();
		add.setResid_add("Amravati, Maharashtra");
		add.setPin(444);
		return add;	
	}
}
