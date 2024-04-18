package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame(); // Mario 게임 인스턴스 생성
//        var gameRunner = new GameRunner(marioGame); // GameRunner로 Mario 게임 실행

        // GameRunner 클래스가 특정 게임과 강하게 결합하고 있음을 알 수 있음
//        var superContraGame = new SuperContraGame();
//        var gameRunner = new GameRunner(superContraGame);
//        gameRunner.run();

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
