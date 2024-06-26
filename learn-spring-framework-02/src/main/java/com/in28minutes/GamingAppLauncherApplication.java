package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.game") // 특정 패키지에서 PacmanGame을 검색해야 한다고 알려줘야 함
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
            // 수동으로 PacmanGame과 GameRunner를 직접 생성하지 않아도 Spring 프레임워크가 자동으로 대신 생성 가능
        }
    }
}
