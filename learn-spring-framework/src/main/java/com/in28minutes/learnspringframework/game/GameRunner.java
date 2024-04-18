package com.in28minutes.learnspringframework.game;

public class GameRunner {
//    MarioGame game; // Mario 게임과 강한 결합을 하고 있음

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }
//    private SuperContraGame game;
//
//    public GameRunner(SuperContraGame game) {
//        this.game = game;
//    }

    // 게임이 클래스를 실행하고, 클래스에서 직접 실행하는 대신 인터페이스를 사용하도록 함
    // 게임을 바꾸려 할 때 GameRunner 클래스에는 아무 변경도 가할 필요가 없음 - 특정 인터페이스와만 결합되어 있기 때문
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
