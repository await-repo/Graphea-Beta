package com.graphea.graphea1.UI.Panes;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class LeftPane extends Pane {

    public LeftPane() {
        init();
    }

    public void init () {
        this.setPrefWidth(22);
        this.setId("leftPane");

        Button action = new Button();
        action.getStyleClass().add("button-gray");
        action.setPrefHeight(50);
        //action.setRotate(-90);
        //action.setPrefHeight(100);

        Button action2 = new Button();
        action2.getStyleClass().add("button-gray");
        action2.setPrefHeight(50);
        //action2.setRotate(-90);
        //action2.setPrefHeight(100);

        //left.getChildren().add(action);
        //this.setLeft( left );

        ToolBar toolbar = new ToolBar();
        toolbar.getItems().add(action);
        toolbar.getItems().add(action2);
        toolbar.setOrientation(Orientation.VERTICAL);
        //toolbar.setPrefHeight(100);
        //toolbar.setRotate(-90);

        this.getChildren().add(toolbar);
    }
}
