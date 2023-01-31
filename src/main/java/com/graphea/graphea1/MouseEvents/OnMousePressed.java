package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowInterface;
import javafx.scene.Parent;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;

public class OnMousePressed {
    private SingletonWindowInterface onMouse;
    private SingletonProvider provider = SingletonProvider.getInstance();

    public OnMousePressed(SingletonWindowInterface onMouse) {
        this.onMouse = onMouse;
    }

    public void OnMousePressed (Parent root) {
        root.setOnMousePressed(evt -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                onMouse.setX(evt.getSceneX());
                onMouse.setY(evt.getSceneY());
            }
        });
    }

    public void OnMousePressed (Circle circle) {
        circle.setOnMousePressed(evt -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                onMouse.setX(evt.getSceneX() - circle.getTranslateX() - provider.getSplitScrollLeft().getWidth());
                onMouse.setY(evt.getSceneY() - circle.getTranslateY() - provider.getHeaderPane().getHeight());
            }
        });
    }
}
