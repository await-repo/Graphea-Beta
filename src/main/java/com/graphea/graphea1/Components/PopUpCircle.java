package com.graphea.graphea1.Components;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import com.graphea.graphea1.Interfaces.InterfacePin;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

import java.io.Serializable;

public class PopUpCircle<T extends Vertex> extends ContextMenu implements Serializable, InterfacePin {
    T type;
    MenuItem delete = new MenuItem("Eliminar");
    MenuItem pin = new MenuItem("Fijar");

    public PopUpCircle(T type) {
        this.type = type;
        init();
    }

    private void init () {
        delete.setOnAction(event -> type.delete());
        pin.setOnAction(event -> pin(type));

        this.getItems().addAll(delete, pin);
    }

    public void setCoords (double x, double y) {
        this.setX(x);
        this.setY(y);
    }
}
