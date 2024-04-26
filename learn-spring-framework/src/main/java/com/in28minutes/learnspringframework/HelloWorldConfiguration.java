package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// JDK 16에서 등장
// Java Bean을 만드는 번거로움을 없애기 위해 도입됨
// record 사용 시, setter, getter, constructor 등을 만들 필요가 없음 -> 자동으로 생성됨
record Person (String name, int age, Address address) {}; // 두 개의 인수가 있는 인물 생성자가 자동으로 생성됨

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
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    // 관리하는 기존 Bean을 사용하여 새로운 Bean 생성 가능
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address()); // name, age, address
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        // name, age, address2
        return new Person(name, age, address3); // name, age, address
    }

    @Bean(name="address2") // Bean 이름 사용자 지정 가능
    public Address address(){
        return new Address("Baker Street", "London");
    }

    @Bean(name="address3")
    public Address address3(){
        return new Address("Motinagar", "Hyderbad");
    }
}
