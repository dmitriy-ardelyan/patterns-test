package com.dmitriy.test.patterns.memento.test;

import com.dmitriy.test.patterns.memento.implementations.File;
import com.dmitriy.test.patterns.memento.implementations.Game;


public class MementoTest {
    public static void main(String[] args) {
        Game game = new Game("LVL_1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.getSave());

        game.setGame("LVL_2", 55000);
        System.out.println(game);

        System.out.println("Load game from save");
        game.loadGame(file.getSave());
        System.out.println(game);
    }
}
