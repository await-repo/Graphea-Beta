package com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;

public class CirclePressedStrategy implements OnPressedInterfaceStrategy {

    private Circle circle;
    private SingletonWindow onMouse = SingletonWindow.getInstance();
    private SingletonProvider provider = SingletonProvider.getInstance();

    public CirclePressedStrategy(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void mousePressed() {
        circle.setOnMousePressed(evt -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                onMouse.setX(evt.getSceneX() - circle.getTranslateX() - provider.getSplitScrollLeft().getWidth());
                onMouse.setY(evt.getSceneY() - circle.getTranslateY() - provider.getHeaderPane().getHeight());
            }
        });
    }

}
