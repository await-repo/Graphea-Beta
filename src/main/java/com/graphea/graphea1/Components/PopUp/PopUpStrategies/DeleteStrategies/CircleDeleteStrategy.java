package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;

public class CircleDeleteStrategy extends MenuItem implements OnDeleteInterfaceStrategy, InterfaceRemove {

    private Vertex circle;
    private String Title;

    public CircleDeleteStrategy(String title, Vertex circle) {
        this.setText(title);
        this.circle = circle;
    }

    @Override
    public MenuItem delete() {
        this.setOnAction(event -> {
            circle.deleteObservers();
            SingletonGraph.getInstance().deleteVertex(circle);
            Message msg = new Message(5, "Vertice Eliminado");
        });
        return this;
    }
}
