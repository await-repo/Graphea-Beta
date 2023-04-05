package com.graphea.graphea1.UI.Components;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split extends SplitPane {
    private Orientation orientation;
    private double dividerPosition;
    private List<Node> components;

    public void init(Orientation orientation, double dividerPosition, Node... components) {
        this.orientation = orientation;
        this.dividerPosition = dividerPosition;
        this.components = Arrays.asList(components);

        this.setOrientation(orientation);
        this.setDividerPositions(dividerPosition);
        this.getItems().addAll(components);

        this.getStyleClass().add("bg-gray");
    }
}
