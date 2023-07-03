package com.study.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		//1 Launch a Spring Context

		var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		//2 Configure the thins that we want Spring

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));


	}

}
