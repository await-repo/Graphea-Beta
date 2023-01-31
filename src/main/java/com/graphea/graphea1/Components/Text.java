package com.graphea.graphea1.Components;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class Text extends TextField implements Serializable {
    private double xAxis;
    private double yAxis;
    private SingletonCircle singleton = SingletonCircle.getInstance();

    public Text() {}

    public Text(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        init();
        setCoords(xAxis, yAxis);
    }

    private void init () {
        this.setEditable(false);
        this.setVisible(singleton.isShowCoords());
    }

    public void setCoords (double x, double y) {
        this.xAxis = x;
        this.yAxis = y;

        this.setTranslateX(x);
        this.setTranslateY(y);
        this.setText(this.xAxis + ", " + this.yAxis);
    }
}
