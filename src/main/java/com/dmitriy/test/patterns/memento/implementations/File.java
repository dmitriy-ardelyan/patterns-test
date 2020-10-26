package com.dmitriy.test.patterns.memento.implementations;

public class File {
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
