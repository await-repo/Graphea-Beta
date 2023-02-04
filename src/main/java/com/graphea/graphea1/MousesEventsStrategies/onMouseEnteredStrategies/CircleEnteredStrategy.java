package com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import javafx.scene.shape.Circle;

public class CircleEnteredStrategy implements OnEnteredInterfaceStrategy {

    private Circle circle;
    private SingletonCircle above= SingletonCircle.getInstance();

    public CircleEnteredStrategy(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void mouseEntered() {
        circle.setOnMouseEntered(mouseEvent -> {
            above.setInside(true);
        });
    }
}
