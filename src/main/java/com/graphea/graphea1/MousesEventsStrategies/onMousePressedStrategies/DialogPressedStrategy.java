package com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.control.DialogPane;
import javafx.scene.input.MouseButton;

public class DialogPressedStrategy implements OnPressedInterfaceStrategy {
    private DialogPane DialogPane;
    private SingletonWindow onMouse = SingletonWindow.getInstance();
    public DialogPressedStrategy(DialogPane DialogPane) {
        this.DialogPane = DialogPane;
    }

    @Override
    public void mousePressed() {
        DialogPane.setOnMousePressed(evt -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                onMouse.setX(evt.getSceneX());
                onMouse.setY(evt.getSceneY());
            }
        });
    }
}
