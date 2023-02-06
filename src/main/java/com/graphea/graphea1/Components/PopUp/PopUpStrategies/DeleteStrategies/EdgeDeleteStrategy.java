package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;

public class EdgeDeleteStrategy extends MenuItem implements OnDeleteInterfaceStrategy, InterfaceRemove {
    private Edge line;

    public EdgeDeleteStrategy(String title, Edge line) {
        this.setText(title);
        this.line = line;
    }

    @Override
    public MenuItem delete() {
        this.setOnAction(event -> {
            SingletonGraph.getInstance().deleteEdge(line);
            remove(line);
            Message msg = new Message(5, "Arista Eliminada");
        });
        return this;
    }
}
