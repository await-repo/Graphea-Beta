package com.graphea.graphea1.MouseEvents;

import javafx.scene.control.ContextMenu;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Shape;

public class OnMouseClicked {
    private ContextMenu contextMenu;

    public OnMouseClicked(ContextMenu contextMenu) {
        this.contextMenu = contextMenu;
    }

    public void onMouseClicked(Shape figure) {
        figure.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) { }

            if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                contextMenu.show(figure, mouseEvent.getSceneX(), mouseEvent.getSceneY());
            }
        });
    }


}
