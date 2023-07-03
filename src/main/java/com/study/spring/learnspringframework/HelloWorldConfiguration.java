package com.study.spring.learnspringframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {

};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age() ,address());
        // 이미 존재하는 Bean을 이용해 새로운 Bean 생성
        // 1.Method 호출
        // 2.파라미터 호출
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {//name, age, address2
        return new Person(name, age ,address2);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
