package com.dmitriy.test.patterns.memento.implementations;

public class Game {
    String level;
    int ms;

    public Save getSave() {
        return new Save(level, ms);
    }

    public Game(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }

    public void setGame(String level, int ms) {
        setLevel(level);
        setMs(ms);
    }

    public void loadGame(Save save) {
        setGame(save.getLevel(), save.getMs());
    }
}
