package com.graphea.graphea1.UI.Components;

import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.scene.control.Button;

public class ButtonAction extends Button {
    String name;
    String className;

    public ButtonAction(String className, ButtonStrategy strategy) {
        this.className = className;
        this.getStyleClass().add(className);
        this.setOnAction(e -> strategy.action(e));
    }

    public ButtonAction(String name, String className, ButtonStrategy strategy) {
        this.name = name;
        this.className = className;
        this.setText(name);
        this.getStyleClass().add(className);
        this.setOnAction(e -> strategy.action(e));
    }

    public ButtonAction(String name, String className, double width, ButtonStrategy strategy) {
        this.name = name;
        this.className = className;
        this.setPrefWidth(width);
        this.setText(name);
        this.getStyleClass().add(className);
        this.setOnAction(e -> strategy.action(e));
    }
}



/*
public ButtonAction(String name, String className) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);
    }
*/

/*
public ButtonAction(String name, String className, EventHandler event) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);

        this.setOnAction(event);
    }
*/

  /*
    public ButtonAction(String name, String className, Runnable function) {
        this.name = name;
        this.className = className;

        this.setText(name);
        this.getStyleClass().add(className);
        this.setOnMouseClicked(e -> function.run());
    }
    */
