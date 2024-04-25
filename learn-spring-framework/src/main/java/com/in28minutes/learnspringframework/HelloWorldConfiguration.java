package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// JDK 16에서 등장
// Java Bean을 만드는 번거로움을 없애기 위해 도입됨
// record 사용 시, setter, getter, constructor 등을 만들 필요가 없음 -> 자동으로 생성됨
record Person (String name, int age) {}; // 두 개의 인수가 있는 인물 생성자가 자동으로 생성됨

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    // Spring Bean을 정의할 수 있음
    // Spring Bean : Spring에서 관리하는 것들

    @Bean // Bean을 생성하며 해당 Bean은 Spring 컨테이너가 관리함
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }

    @Bean
    public Address address(){
        return new Address("Baker Street", "London");
    }
}
