package com.graphea.graphea1.UI.Panes.bottomComponents;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

import java.util.Arrays;

public class ContainerNotification extends FlowPane {
    private String type;

    public ContainerNotification(String type) {
        this.type = type;
        this.setId(type);
        //this.setPrefWidth(0);
        this.setOrientation(Orientation.HORIZONTAL);
    }

    public void add (Node... components) {
        this.getChildren().addAll( Arrays.asList(components) );
    }

    public void add (Node component) {
        this.getChildren().add(0, component);
    }

    public Notification getNotification (String id) {
        for (Node notification: this.getChildren()) {
            if (notification.getId().equals(id)) {
                return (Notification) notification;
            }
        }
        return null;
    }

    public void removeNotification (Notification notification) {
        this.getChildren().remove(notification);
    }

    public void removeNotification (String id) {
        this.getChildren().removeIf(item -> item.getId().equals(id));
    }

}
