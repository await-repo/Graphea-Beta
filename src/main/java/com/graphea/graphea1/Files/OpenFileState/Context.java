package com.graphea.graphea1.Files.OpenFileState;

import java.io.FileWriter;

public class Context {
    private State state;

    public void setState( State state ) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void read(String line) {
        state.read(line);
    }

}
