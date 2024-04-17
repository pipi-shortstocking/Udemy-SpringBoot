package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame(); // Mario 게임 인스턴스 생성
        var gameRunner = new GameRunner(marioGame); // GameRunner로 Mario 게임 실행
        gameRunner.run();
    }
}
