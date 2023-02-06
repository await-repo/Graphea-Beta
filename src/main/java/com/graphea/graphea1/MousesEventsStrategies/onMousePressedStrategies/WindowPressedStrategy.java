package com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.Parent;
import javafx.scene.input.MouseButton;

public class WindowPressedStrategy implements OnPressedInterfaceStrategy {

    private Parent root;
    private SingletonWindow onMouse = SingletonWindow.getInstance();
    public WindowPressedStrategy(Parent root) {
        this.root = root;
    }

    @Override
    public void mousePressed() {
        root.setOnMousePressed(evt -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                onMouse.setX(evt.getSceneX());
                onMouse.setY(evt.getSceneY());
            }
        });
    }

}