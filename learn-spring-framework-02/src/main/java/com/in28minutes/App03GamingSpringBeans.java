package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.game") // 특정 패키지에서 PacmanGame을 검색해야 한다고 알려줘야 함
public class App03GamingSpringBeans {
    @Bean
    public GameRunner gameRunner(GamingConsole game) { // PacmanGame을 GamingConsole로 Autowiring 가능
        System.out.println("Parameter: " + game);
        // Spring이 PacmanGame의 인스턴스를 생성하고, 이 인스터스가 Autowiring되어 PacmanGame이 매개변수 임을 확인 가능
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (App03GamingSpringBeans.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }
}
