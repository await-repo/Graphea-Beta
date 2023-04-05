package com.graphea.graphea1.UI.Panes.bottomComponents;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

import java.util.List;

public class Index extends FlowPane {

    public Index() {
        AnchorPane.setTopAnchor(this, 2.0);
        AnchorPane.setLeftAnchor(this, 10.0);
        AnchorPane.setBottomAnchor(this, 3.0);
        AnchorPane.setRightAnchor(this, 10.0);
    }

    public ContainerNotification getPaneById (String id) {
        for (Node item: this.getChildren()) {
            if (item.getId().equals(id)) {
                return (ContainerNotification) item;
            }
        }
        return null;
    }
}
