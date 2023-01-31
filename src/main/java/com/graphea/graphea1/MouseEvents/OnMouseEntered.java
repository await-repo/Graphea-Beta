package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.Singletons.Figure.SingletonShape;
import javafx.scene.shape.Shape;

public class OnMouseEntered {

    private SingletonShape onMouse;

    public OnMouseEntered(SingletonShape onMouse) {
        this.onMouse = onMouse;
    }

    public void onMouseEntered (Shape figure) {
        figure.setOnMouseEntered(mouseEvent -> {
            onMouse.setInside(true);
        });
    }
}
