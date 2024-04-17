package com.in28minutes.learnspringframework.game;

public class GameRunner {
//    MarioGame game; // Mario 게임과 강한 결합을 하고 있음

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }
    private SuperContraGame game;

    public GameRunner(SuperContraGame game) {
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
