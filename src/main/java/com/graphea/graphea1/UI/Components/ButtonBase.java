package com.graphea.graphea1.UI.Components;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class ButtonBase extends Button {

    String name;
    Color backgroundColor;
    String className;

    public ButtonBase(String name, String className) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);
    }

    public ButtonBase(String name, String className, Runnable function) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);
        this.setOnMouseClicked(e -> function.run());
    }
    public ButtonBase(String name, String className, EventHandler event) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);

        this.setOnAction(event);
    }

}
