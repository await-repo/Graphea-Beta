package com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies.OnRenameInterfaceStrategy;
import javafx.scene.control.MenuItem;

public class RenameContext {
    public MenuItem rename(OnRenameInterfaceStrategy strategy){
        return strategy.rename();
    }

}
