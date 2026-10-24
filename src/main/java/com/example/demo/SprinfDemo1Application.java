package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprinfDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SprinfDemo1Application.class, args);
		
		Student std = ac.getBean(Student.class);
		System.out.println(std.getRoll());
		System.out.println(std.getName());
		
	}

}
