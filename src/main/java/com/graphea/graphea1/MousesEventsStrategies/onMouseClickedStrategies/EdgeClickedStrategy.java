package com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import javafx.scene.input.MouseButton;

public class EdgeClickedStrategy implements OnClickedInterfaceStrategy {
    private Edge line;

    public EdgeClickedStrategy(Edge line) {
        this.line = line;
    }

    @Override
    public void mouseClicked () {
        line.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) { }

            if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                line.getPopUpMenu().show(line, mouseEvent.getSceneX(), mouseEvent.getSceneY());
            }
        });
    }
}
