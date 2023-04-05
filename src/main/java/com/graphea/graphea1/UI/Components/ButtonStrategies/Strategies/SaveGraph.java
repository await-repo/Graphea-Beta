package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Files.SaveFile;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;

public class  SaveGraph implements ButtonStrategy {
    public void action(ActionEvent e) {
        SaveFile file = new SaveFile();
        file.createFile();
        file.saveFile();
    }
}
