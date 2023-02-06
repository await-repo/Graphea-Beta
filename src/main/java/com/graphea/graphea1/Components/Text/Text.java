package com.graphea.graphea1.Components.Text;

import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.TextField;

import java.io.Serializable;

public abstract class Text extends TextField implements Serializable, Observer, InterfaceRemove {
    protected double xAxis;
    protected double yAxis;
    protected SingletonCircle singleton = SingletonCircle.getInstance();
    protected SingletonWindowCircle windowCircle = SingletonWindowCircle.getInstance();

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
        coords();
    }

    @Override
    public void delete(Vertex circle) {
        remove(this);
    }

    @Override
    public abstract void move(Vertex circle);

    public abstract void coords ();
}
