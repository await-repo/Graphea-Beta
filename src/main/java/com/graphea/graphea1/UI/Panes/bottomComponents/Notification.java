package com.graphea.graphea1.UI.Panes.bottomComponents;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Notification extends Label {

    private String message;
    private String type;
    private Insets insets = new Insets(0.0f, 10.0f, 0.0f, 0.0f);

    public Notification(String message, String type) {
        this.message = message;
        this.type = type;
        this.setId(message);

        this.setText(message);
        this.setTextFill( typeNotification(type) );
        this.setPadding(insets);
    }

    private Color typeNotification (String type) {
        switch (type) {
            case "primary":return Color.GREENYELLOW;
            case "secondary": return Color.YELLOW;
            case "danger": return Color.RED;
            case "command": return Color.GRAY;
            default: return Color.BLUE;
        }
    }

    public String getType() {
        return type;
    }
}
