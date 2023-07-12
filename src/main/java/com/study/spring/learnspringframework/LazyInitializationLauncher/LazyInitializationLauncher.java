package com.study.spring.learnspringframework.LazyInitializationLauncher;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do something");
    }

}

@Configuration
@ComponentScan
public class LazyInitializationLauncher {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializationLauncher.class)) {

//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("초기화완료");
            context.getBean(ClassB.class).doSomething();
        }

    }
}
