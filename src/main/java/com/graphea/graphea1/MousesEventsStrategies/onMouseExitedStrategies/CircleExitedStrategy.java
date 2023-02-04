package com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import javafx.scene.shape.Circle;

public class CircleExitedStrategy implements OnExitedInterfaceStrategy {
    private Circle circle;
    private SingletonCircle above= SingletonCircle.getInstance();

    public CircleExitedStrategy(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void mouseExited() {
        circle.setOnMouseExited(mouseEvent -> {
            above.setInside(false);
        });
    }
}
