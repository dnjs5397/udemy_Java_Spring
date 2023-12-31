package com.study.spring.learnspringframework.PrePostAnnotationsContextLauncher;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleaned");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
}


@Component
class SomeDependency {


    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }

}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncher {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }

    }

}
