package com.in28minutes.learnspringframework.game;

public class GameRunner {
    Game game;
    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.left();
        game.right();
        game.down();
    }
}
