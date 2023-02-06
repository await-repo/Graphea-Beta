package com.graphea.graphea1.Components.Text;

import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class TextCoords extends Text {

    public TextCoords(double xAxis, double yAxis) {
        super(xAxis, yAxis);
    }

    public void coords () {
        this.setText(this.xAxis + ", " + this.yAxis);
    }

    @Override
    public void move(Vertex circle) {
        this.setCoords(windowCircle.getX() + 15, windowCircle.getY());
        coords();
    }

}
