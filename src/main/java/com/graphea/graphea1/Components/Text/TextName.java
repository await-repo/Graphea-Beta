package com.graphea.graphea1.Components.Text;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public class TextName extends Text {

    String name;
    public TextName(double xAxis, double yAxis) {
        super(xAxis, yAxis);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void coords () {
        this.setText(name);
    }

    @Override
    public void move(Vertex circle) {
        this.setCoords(windowCircle.getX() - 30, windowCircle.getY() - 45);
        coords();
    }

}

