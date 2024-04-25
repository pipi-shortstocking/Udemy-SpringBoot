package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Spring context 실행
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Spring framework가 관리하도록 할 것 설정(configure)
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Spring이 관리하는 Bean을 검색함
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address"));
    }
}
