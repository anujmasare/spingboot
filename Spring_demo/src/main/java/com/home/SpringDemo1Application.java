package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EnableCaching
public class SpringDemo1Application {
//d
	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
		System.out.println(" spring boot application");
		//System.out.println("new changes");
		
		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SpringDemo1Application.class, args);
		 * 
		 * for (String name : applicationContext.getBeanDefinitionNames()) {
		 * //System.out.println(name); }
		 */
	}

}
