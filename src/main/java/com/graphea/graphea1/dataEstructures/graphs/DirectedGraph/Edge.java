package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Components.PopUpLine;
import com.graphea.graphea1.MouseEvents.OnMouseClicked;
import com.graphea.graphea1.MouseEvents.OnMouseEntered;
import com.graphea.graphea1.MouseEvents.OnMouseExited;
import com.graphea.graphea1.Singletons.Figure.SingletonLine;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.io.Serializable;

public class Edge extends Line implements Serializable {

    private Vertex start;
    private Vertex end;


    private transient PopUpLine popUpMenu = new PopUpLine(this);
    private transient OnMouseEntered mouseEntered = new OnMouseEntered(SingletonLine.getInstance());
    private transient OnMouseExited mouseExited = new OnMouseExited(SingletonLine.getInstance());
    private transient OnMouseClicked mouseClicked = new OnMouseClicked(popUpMenu);


    public Edge(Vertex origin, Vertex destination) {
        this.start = origin;
        this.end = destination;

        init();

        mouseEntered.onMouseEntered(this);
        mouseExited.onMouseExited(this);
        mouseClicked.onMouseClicked(this);
    }

    public void delete() {
        SingletonGraph.getInstance().deleteEdge(this);
    }

    private void init () {
        //Lineas que representan las aristas
        this.setStartX(start.getxAxis());
        this.setStartY(start.getyAxis());

        this.setEndX(end.getxAxis());
        this.setEndY(end.getyAxis());

        this.setStrokeWidth(5);
        this.setStroke(Color.BLACK);
        this.setOpacity(0.5);
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public void setStart(double x, double y) {
        this.start = new Vertex(x, y);
        this.setEndX(x);
        this.setEndY(y);
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public void setEnd(double x, double y) {
        this.end = new Vertex(x, y);
        this.setEndX(x);
        this.setEndY(y);
    }

    @Override
    public String toString() {
        return "\n\t\t Edge{ start = " + start + ", end=" + end + " }";
    }
}
