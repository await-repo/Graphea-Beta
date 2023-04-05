package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Files.OpenFile;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;

public class OpenGraph implements ButtonStrategy {
    public void action(ActionEvent e) {
        OpenFile file = new OpenFile();
        file.readFile();
    }
}
