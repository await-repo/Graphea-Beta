package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;

public class RemoveAll implements ButtonStrategy {
    Global provider = Global.getInstance();

    public void action(ActionEvent e) {
        provider.getCentralPane().getChildren().clear();
    }
}
