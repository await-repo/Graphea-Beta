package com.graphea.graphea1.Singletons.Figure;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.Serializable;

public class SingletonCircle implements SingletonShape, Serializable {

    private boolean insideTheCircle = false;
    private boolean isShowCoords = false;
    private Vertex start = null;
    private Vertex end = null;

    private static final SingletonCircle INSTANCE = new SingletonCircle();

    private SingletonCircle() {}

    public static SingletonCircle getInstance() {
        return INSTANCE;
    }

    public boolean isShowCoords() {
        return isShowCoords;
    }

    public void setShowCoords(boolean showCoords) {
        isShowCoords = showCoords;
    }


    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }


    @Override
    public boolean isInside() {
        return insideTheCircle;
    }

    @Override
    public void setInside(boolean isInside) {
        this.insideTheCircle = isInside;
    }
}
