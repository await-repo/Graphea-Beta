package com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies;

import com.graphea.graphea1.Singletons.Figure.SingletonLine;
import javafx.scene.shape.Line;

public class EdgeEnteredStrategy implements OnEnteredInterfaceStrategy {

    private Line edge;
    private SingletonLine above = SingletonLine.getInstance();

    public EdgeEnteredStrategy(Line edge) {
        this.edge = edge;
    }

    @Override
    public void mouseEntered() {
        edge.setOnMouseEntered(mouseEvent -> {
            above.setInside(true);
        });
    }
}
