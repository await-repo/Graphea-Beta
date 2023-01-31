package com.graphea.graphea1.Singletons.Providers;

import java.io.Serializable;

public class SingletonWindow implements SingletonWindowInterface, Serializable {

    private double x, y = 0;

    private static final SingletonWindow INSTANCE = new SingletonWindow();

    public static SingletonWindow getInstance() {
        return INSTANCE;
    }

    private SingletonWindow() {}

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }
}
