package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.Singletons.Figure.SingletonShape;
import javafx.scene.shape.Shape;

public class OnMouseExited {
    private SingletonShape onMouse;

    public OnMouseExited(SingletonShape onMouse) {
        this.onMouse = onMouse;
    }

    public void onMouseExited (Shape figure) {
        figure.setOnMouseExited(mouseEvent -> {
            onMouse.setInside(false);
        });
    }
}
