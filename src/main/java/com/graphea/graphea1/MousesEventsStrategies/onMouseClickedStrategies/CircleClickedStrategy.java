package com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.input.MouseButton;

public class CircleClickedStrategy implements OnClickedInterfaceStrategy {

    private Vertex circle;

    public CircleClickedStrategy(Vertex circle) {
        this.circle = circle;
    }

    @Override
    public void mouseClicked () {
        circle.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) { }

            if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                circle.getPopUpMenu().show(circle, mouseEvent.getSceneX(), mouseEvent.getSceneY());
            }
        });
    }
}
