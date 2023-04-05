package com.graphea.graphea1.UI.Components;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class Container extends AnchorPane {

    private Node component;

    public Container(Node component, String orientation, double... spaces) {
        this.component = component;
        init(orientation, spaces);
    }

    private void init (String orientation, double... spaces) {
        int size = spaces.length;

        switch (size) {
            case 1:
                switch (orientation) {
                    case "top": AnchorPane.setTopAnchor(component, spaces[0]); break;
                    case "right": AnchorPane.setRightAnchor(component, spaces[0]); break;
                    case "bottom": AnchorPane.setBottomAnchor(component, spaces[0]); break;
                    case "left": AnchorPane.setLeftAnchor(component, spaces[0]); break;
                }
                break;
            case 2:
                switch (orientation) {
                    case "left-top":
                        AnchorPane.setLeftAnchor(component, spaces[0]);
                        AnchorPane.setTopAnchor(component, spaces[1]);
                        break;
                    case "right-top":
                        AnchorPane.setRightAnchor(component, spaces[0]);
                        AnchorPane.setTopAnchor(component, spaces[1]);
                        break;
                    case "right-bottom":
                        AnchorPane.setRightAnchor(component, spaces[0]);
                        AnchorPane.setBottomAnchor(component, spaces[1]);
                    break;
                    case "left-bottom":
                        AnchorPane.setLeftAnchor(component, spaces[0]);
                        AnchorPane.setBottomAnchor(component, spaces[1]);
                    break;
                }
            case 3:
                switch (orientation) {
                    case "top":
                        AnchorPane.setLeftAnchor(component, spaces[0]);
                        AnchorPane.setTopAnchor(component, spaces[1]);
                        AnchorPane.setRightAnchor(component, spaces[2]);
                        break;
                    case "right":
                        AnchorPane.setRightAnchor(component, spaces[0]);
                        AnchorPane.setTopAnchor(component, spaces[1]);
                        break;
                    case "bottom":
                        AnchorPane.setRightAnchor(component, spaces[0]);
                        AnchorPane.setBottomAnchor(component, spaces[1]);
                        break;
                    case "left":
                        AnchorPane.setLeftAnchor(component, spaces[0]);
                        AnchorPane.setBottomAnchor(component, spaces[1]);
                        break;
                }
            case 4:
                AnchorPane.setTopAnchor(component, spaces[0]);
                AnchorPane.setLeftAnchor(component, spaces[1]);
                AnchorPane.setBottomAnchor(component, spaces[2]);
                AnchorPane.setRightAnchor(component, spaces[3]);
            break;
        }

    }
}
