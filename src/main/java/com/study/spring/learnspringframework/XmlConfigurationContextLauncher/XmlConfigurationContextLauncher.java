package com.study.spring.learnspringframework.XmlConfigurationContextLauncher;

import com.study.spring.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XmlConfigurationContextLauncher {

    public static void main(String[] args) {

        try(var context =
                    new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            context.getBean(GameRunner.class).run();


        }

    }

}
