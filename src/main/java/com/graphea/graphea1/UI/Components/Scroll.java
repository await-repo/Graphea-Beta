package com.graphea.graphea1.UI.Components;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

public class Scroll extends ScrollPane {

    public Scroll(AnchorPane control) {
        this.setContent(control);
        this.getStyleClass().add("bg-gray");
    }
}
