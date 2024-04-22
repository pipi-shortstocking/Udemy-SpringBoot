package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    // Spring Bean을 정의할 수 있음
    // Spring Bean : Spring에서 관리하는 것들

    @Bean // Bean을 생성하며 해당 Bean은 Spring 컨테이너가 관리함ㄴ
    public String name() {
        return "Ranga";
    }
}
