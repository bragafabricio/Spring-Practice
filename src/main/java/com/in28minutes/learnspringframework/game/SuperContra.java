package com.in28minutes.learnspringframework.game;

public class SuperContra implements Game{

    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("Lay down");
    }
    public void left() {
        System.out.println("Defend");
    }
    public void right() {
        System.out.println("Shoot");
    }
}
