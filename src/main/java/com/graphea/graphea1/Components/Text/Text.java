package com.graphea.graphea1.Components.Text;

import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class Text extends TextField implements Serializable, Observer {
    private double xAxis;
    private double yAxis;
    private SingletonCircle singleton = SingletonCircle.getInstance();
    private SingletonWindowCircle windowCircle = SingletonWindowCircle.getInstance();

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

    @Override
    public void update(Vertex circle) {
        this.setCoords(windowCircle.getX() + 15, windowCircle.getY());
    }
}
