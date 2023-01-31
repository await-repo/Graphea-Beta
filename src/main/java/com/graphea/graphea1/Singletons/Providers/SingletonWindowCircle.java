package com.graphea.graphea1.Singletons.Providers;

import java.io.Serializable;

public class SingletonWindowCircle implements SingletonWindowInterface, Serializable {

    private double x, y;

    private static final SingletonWindowCircle INSTANCE = new SingletonWindowCircle();

    public static SingletonWindowCircle getInstance() {
        return INSTANCE;
    }

    private SingletonWindowCircle() {}


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
