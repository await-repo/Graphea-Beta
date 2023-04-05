package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MinimizeWindow implements ButtonStrategy {

    public void action (ActionEvent e) {
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        stage.setIconified(true);
        /*
        if (!isMinimized) {
            stage.setIconified(true);
        }
        */
    }
}
