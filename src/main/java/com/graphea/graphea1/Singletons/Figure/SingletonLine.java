package com.graphea.graphea1.Singletons.Figure;

import java.io.Serializable;

public class SingletonLine implements SingletonShape, Serializable {

    private boolean insideTheLine = false;

    private static final SingletonLine INSTANCE = new SingletonLine();

    private SingletonLine(){};

    public static SingletonLine getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean isInside() {
        return insideTheLine;
    }

    @Override
    public void setInside(boolean isInside) {
        this.insideTheLine = isInside;
    }
}
