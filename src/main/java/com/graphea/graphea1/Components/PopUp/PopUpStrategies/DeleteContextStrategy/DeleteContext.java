package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteContextStrategy;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.OnDeleteInterfaceStrategy;
import javafx.scene.control.MenuItem;

public class DeleteContext {

    public MenuItem delete(OnDeleteInterfaceStrategy strategy){
        return strategy.delete();
    }

}
