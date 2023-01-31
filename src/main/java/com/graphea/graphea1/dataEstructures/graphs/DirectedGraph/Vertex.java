package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.Components.Text;
import com.graphea.graphea1.Components.PopUpCircle;
import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.MouseEvents.*;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vertex extends Circle implements Serializable, InterfacePin, InterfaceRemove {

    private String value;
    private double xAxis, yAxis;
    private Text coords;
    private List<Edge> edgesAdjacents = new ArrayList();



    private SingletonCircle singleton = SingletonCircle.getInstance();
    private SingletonWindow window = SingletonWindow.getInstance();
    private SingletonWindowCircle WindowCircle = SingletonWindowCircle.getInstance();


    private transient PopUpCircle popUpMenu = new PopUpCircle(this);
    private transient OnMouseExited mouseExited = new OnMouseExited(singleton);
    private transient OnMouseEntered mouseEntered = new OnMouseEntered(singleton);
    private transient OnMouseClicked mouseClicked = new OnMouseClicked(popUpMenu);
    private transient OnMousePressed onMousePressed = new OnMousePressed(window);
    private transient OnMouseDragged onMouseDragged = new OnMouseDragged(WindowCircle);


    public Vertex(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.coords = new Text(xAxis + 15, yAxis);

        init();

        mouseEntered.onMouseEntered(this);
        mouseExited.onMouseExited(this);
        mouseClicked.onMouseClicked(this);
        onMousePressed.OnMousePressed(this);
        onMouseDragged.OnMouseDragged(this);
    }

    public void removeEdge (Edge edge) {
        edgesAdjacents.remove(edge);
        remove(edge);
    }

    public void delete () {
        SingletonGraph.getInstance().deleteVertex(this);
    }

    private void init () {
        this.setCenterX(xAxis);
        this.setCenterY(yAxis);
        this.setRadius(20);
        this.setFill(Color.WHITE);
        this.setStrokeWidth(5);
        this.setStroke(Color.BLACK);
    }

    public void moveEdgesAdjacents () {
        for (Edge edge: edgesAdjacents) {
            if (isEqual(edge.getEnd())) {
                edge.setEndX(WindowCircle.getX());
                edge.setEndY(WindowCircle.getY());
            }
            if (isEqual(edge.getStart())) {
                edge.setStartX(WindowCircle.getX());
                edge.setStartY(WindowCircle.getY());
            }
        }
    }

    public void setTranslate (double x, double y) {
        this.setTranslateX(x);
        this.setTranslateY(y);
    }

    public void setAxis (double x, double y) {
        this.setxAxis(x);
        this.setyAxis(y);
    }

    public boolean isEqual (Vertex vertex) {
        return this.getxAxis() == vertex.getxAxis() && this.getyAxis() == vertex.getyAxis();
    }

    public List<Edge> getEdgesAdjacents() {
        return edgesAdjacents;
    }
    public void setEdgesAdjacents(List<Edge> edgesAdjacents) {
        this.edgesAdjacents = edgesAdjacents;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getxAxis() {
        return xAxis;
    }

    public void setxAxis(double xAxis) {
        this.xAxis = xAxis;
    }

    public double getyAxis() {
        return yAxis;
    }

    public void setyAxis(double yAxis) {
        this.yAxis = yAxis;
    }

    public Text getCoords() {
        return coords;
    }

    public void setCoords(Text coords) {
        this.coords = coords;
    }

    public PopUpCircle getPopUpMenu() {
        return popUpMenu;
    }

    public void setPopUpMenu(PopUpCircle popUpMenu) {
        this.popUpMenu = popUpMenu;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                '}';
    }
}
