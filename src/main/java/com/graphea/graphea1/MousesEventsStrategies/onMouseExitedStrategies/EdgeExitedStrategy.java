package com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies;

import com.graphea.graphea1.Singletons.Figure.SingletonLine;
import javafx.scene.shape.Line;

public class EdgeExitedStrategy implements OnExitedInterfaceStrategy {
    private Line edge;
    private SingletonLine above = SingletonLine.getInstance();

    public EdgeExitedStrategy(Line edge) {
        this.edge = edge;
    }

    @Override
    public void mouseExited() {
        edge.setOnMouseExited(mouseEvent -> {
            above.setInside(false);
        });
    }
}
