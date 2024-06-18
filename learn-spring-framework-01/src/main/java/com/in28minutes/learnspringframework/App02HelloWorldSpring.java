package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2")); // Bean의 이름으로 검색

        System.out.println(context.getBean(Person.class)); // Bean의 유형으로 검색

        System.out.println(context.getBean(Address.class)); // Bean의 유형으로 검색

        System.out.println(context.getBean("person5Qualifier"));

        // Spring Bean 나열을 위해서는 컨텍스트를 요청해야 함
        // System.out.println
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println); // 메서드 참조
    }
}
