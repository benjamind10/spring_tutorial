package com.shiva187.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 2: Configure things that we want spring framework to manage - @Configuration
			
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
//			System.out.println(context.getBean(Address.class));
			
			// print all beans
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
	}
}