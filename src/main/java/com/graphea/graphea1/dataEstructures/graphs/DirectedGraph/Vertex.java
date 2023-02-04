package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Components.PopUp.PopUp;
import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Observer.Subject;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.Components.Text.Text;
import com.graphea.graphea1.Components.PopUp.PopUpCircle;
import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.MouseEvents.*;
import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.CircleClickedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.CircleDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies.CircleEnteredStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.CircleExitedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.CirclePressedStrategy;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vertex extends Circle implements Serializable, InterfacePin, InterfaceRemove, Subject {

    private String value;
    private double xAxis, yAxis;
    private Text coords;

    private SingletonWindowCircle WindowCircle = SingletonWindowCircle.getInstance();
    private transient PopUp popUpMenu = new PopUpCircle(this);
    private transient OnMouseExitedContext mouseExited = new OnMouseExitedContext();
    private transient OnMouseEnteredContext mouseEntered = new OnMouseEnteredContext();
    private transient OnMouseClickedContext mouseClicked = new OnMouseClickedContext();
    private transient OnMousePressedContext onMousePressedContext = new OnMousePressedContext();
    private transient OnMouseDraggedContext onMouseDraggedContext = new OnMouseDraggedContext();


    public Vertex(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.coords = new Text(xAxis + 15, yAxis);

        init();

        registerObserver(popUpMenu);
        registerObserver(coords);

        mouseEntered.mouseEntered(new CircleEnteredStrategy(this));
        mouseExited.mouseExited(new CircleExitedStrategy(this));
        mouseClicked.mouseClicked(new CircleClickedStrategy(this));
        onMousePressedContext.mousePressed(new CirclePressedStrategy(this));
        onMouseDraggedContext.mouseDragged(new CircleDraggedStrategy(this));
    }

    public void removeEdge (Edge edge) {
        unregisterObserver(edge);
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

    public PopUp getPopUpMenu() {
        return popUpMenu;
    }

    public void setPopUpMenu(PopUpCircle popUpMenu) {
        this.popUpMenu = popUpMenu;
    }

    @Override
    public String toString() {
        return "Node{ value = '" + value + "', xAxis=" + xAxis +", yAxis=" + yAxis + "}";
    }




    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observerList) {
            o.update(this);
        }
    }

}
