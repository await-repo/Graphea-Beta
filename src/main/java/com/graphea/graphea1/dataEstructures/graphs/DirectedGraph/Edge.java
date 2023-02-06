package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Components.PopUp.PopUp;
import com.graphea.graphea1.Components.Text.Text;
import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Components.PopUp.PopUpLine;
import com.graphea.graphea1.MouseEvents.OnMouseClickedContext;
import com.graphea.graphea1.MouseEvents.OnMouseEnteredContext;
import com.graphea.graphea1.MouseEvents.OnMouseExitedContext;
import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.EdgeClickedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies.EdgeEnteredStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.EdgeExitedStrategy;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.io.Serializable;

public class Edge extends Line implements Serializable, Observer, InterfaceRemove {

    private Vertex start;
    private Vertex end;
    private String value;

    private transient PopUp popUpMenu = new PopUpLine(this);
    private SingletonWindowCircle WindowCircle = SingletonWindowCircle.getInstance();
    private transient OnMouseEnteredContext mouseEntered = new OnMouseEnteredContext();
    private transient OnMouseExitedContext mouseExited = new OnMouseExitedContext();
    private transient OnMouseClickedContext mouseClicked = new OnMouseClickedContext();
    private TextName name;


    public Edge(Vertex origin, Vertex destination) {
        this.start = origin;
        this.end = destination;
        this.name = new TextName(
            (start.getxAxis() + end.getxAxis()) / 2,
            (start.getyAxis() + end.getyAxis()) / 2
        );

        init();

        mouseEntered.mouseEntered(new EdgeEnteredStrategy(this));
        mouseExited.mouseExited(new EdgeExitedStrategy(this));
        mouseClicked.mouseClicked(new EdgeClickedStrategy(this));
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

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public PopUp getPopUpMenu() {
        return popUpMenu;
    }

    public void setPopUpMenu(PopUpLine popUpMenu) {
        this.popUpMenu = popUpMenu;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.name.setName(value);
        this.name.coords();
    }

    public TextName getName() {
        return name;
    }

    public void setName(TextName name) {
        this.name = name;
    }

    public String getNames () {
        return " {" + start.getValue()+ " -> " + end.getValue() + "}";
    }

    @Override
    public String toString() {
        return start + "-" + end;
    }

    @Override
    public void move(Vertex circle) {
        if (circle.isEqual(end)) {
            setEndX(WindowCircle.getX());
            setEndY(WindowCircle.getY());
        }
        if (circle.isEqual(start)) {
            setStartX(WindowCircle.getX());
            setStartY(WindowCircle.getY());
        }
        name.setCoords(
            (start.getxAxis() + end.getxAxis()) / 2,
            (start.getyAxis() + end.getyAxis()) / 2
        );
    }

    @Override
    public void delete(Vertex circle) {
        remove(this);
        remove(this.getName());
    }
}
