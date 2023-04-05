package com.graphea.graphea1.UI.Components;

import com.graphea.graphea1.Interfaces.InterfaceAddCircle;
import com.graphea.graphea1.Interfaces.InterfaceAddLine;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Figure.SingletonLine;
import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Anchor extends AnchorPane implements InterfaceAddCircle, InterfaceAddLine {

    private SingletonCircle singleton = SingletonCircle.getInstance();
    private SingletonLine singletonL = SingletonLine.getInstance();

    private Global provider = Global.getInstance();

    public Anchor() {
        provider.setCentralPane(this);
        this.getStyleClass().add("bg-dark");
        this.setPrefWidth(1000);
        this.setPrefHeight(500);
        this.setOnMouseClicked(e -> onMouseGenerate(e));
    }

    private void onMouseGenerate(MouseEvent e) {
        if (e.getButton() == MouseButton.PRIMARY) {

        }
        if (e.getButton() == MouseButton.SECONDARY) {
            if (!singleton.isInside() && !singletonL.isInside()) {
                addCircleInto(e.getSceneX(), e.getSceneY());
            }
        }
    }

    private void addCircleInto(double xAxis, double yAxis) {
        //init();
        addCircle(xAxis, yAxis);
    }
}
