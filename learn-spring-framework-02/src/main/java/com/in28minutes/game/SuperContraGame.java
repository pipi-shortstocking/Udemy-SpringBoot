package com.in28minutes.game;

public class SuperContraGame implements GamingConsole { // GamingConsole 도입
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}
