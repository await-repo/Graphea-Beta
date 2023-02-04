package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;

public class EdgeDeleteStrategy extends MenuItem implements OnDeleteInterfaceStrategy {
    private Edge line;

    public EdgeDeleteStrategy(String title, Edge line) {
        this.setText(title);
        this.line = line;
    }

    @Override
    public MenuItem delete() {
        this.setOnAction(event -> line.delete());
        return this;
    }
}
