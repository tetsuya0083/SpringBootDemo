package com.estsoft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		// Spring Container가 관리하는 bean 조회
//		ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
//		String[] beanList = context.getBeanDefinitionNames();
//		Arrays.stream(beanList).forEach(System.out::println);

		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//			System.out.println("Spring Boot에서 관리하는 Bean 목록:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames); // 알파벳 순으로 정렬
//
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//		};
//	}



}
