package com.graphea.graphea1.Components;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

import java.io.Serializable;

public class PopUpLine<T extends Edge> extends ContextMenu implements Serializable {
    T type;
    MenuItem delete = new MenuItem("Eliminar");

    public PopUpLine(T type) {
        this.type = type;
        init();
    }

    private void init () {
        delete.setOnAction(event -> type.delete());
        this.getItems().addAll(delete);
    }

    public void setCoords (double x, double y) {
        this.setX(x);
        this.setY(y);
    }
}
