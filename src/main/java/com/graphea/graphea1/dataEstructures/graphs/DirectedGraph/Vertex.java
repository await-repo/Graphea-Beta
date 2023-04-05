package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Components.PopUp.PopUp;
import com.graphea.graphea1.Components.Text.Text;
import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Factory.FactoryVertexStrategies;
import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Observer.Subject;
import com.graphea.graphea1.Components.Text.TextCoords;
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
import javafx.scene.shape.Shape;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertex extends Circle implements Serializable, InterfacePin, InterfaceRemove, Subject {

    private String value;
    private double xAxis, yAxis;



    private TextCoords coords;
    private List<Observer> observerList;


    private PopUp popUpMenu;
    private TextName name;



    public Vertex(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.observerList = new ArrayList<>();
        this.popUpMenu = new PopUpCircle(this);
        this.coords = new TextCoords(xAxis + 15, yAxis);
        this.name = new TextName(xAxis - 30, yAxis - 45);
        init();
        registerObserver(popUpMenu);
        registerObserver(coords);
        registerObserver(name);
        new FactoryVertexStrategies(this);
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
        xAxis = x;
        yAxis = y;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.name.setName(value);
        this.name.coords();
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
    public void setCoords(TextCoords coords) {
        this.coords = coords;
    }
    public TextName getName() {
        return name;
    }
    public void setName(TextName name) {
        this.name = name;
    }
    public PopUp getPopUpMenu() {
        return popUpMenu;
    }
    public void setPopUpMenu(PopUpCircle popUpMenu) {
        this.popUpMenu = popUpMenu;
    }


    @Override
    public String toString() {
        return "{" + xAxis + ", " + yAxis + "}";
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void moveObservers() {
        observerList.forEach(o -> o.move(this));
    }

    @Override
    public void deleteObservers() {
        observerList.forEach(o -> o.delete(this));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Double.compare(vertex.xAxis, xAxis) == 0 && Double.compare(vertex.yAxis, yAxis) == 0;
    }

    /*
    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis);
    }
    */

}
