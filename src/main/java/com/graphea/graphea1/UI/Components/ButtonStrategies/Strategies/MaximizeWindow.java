package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MaximizeWindow implements ButtonStrategy {

    private boolean isMaximized = false;

    public void action (ActionEvent e) {
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        if (!isMaximized) {
            stage.setMaximized(true);
            isMaximized = !isMaximized;
        } else {
            stage.setHeight(650);
            stage.setWidth(1200);
        }
    }
}
