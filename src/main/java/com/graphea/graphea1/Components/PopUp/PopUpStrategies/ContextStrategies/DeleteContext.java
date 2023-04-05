package com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.OnDeleteInterfaceStrategy;
import javafx.scene.control.MenuItem;

public class DeleteContext {

    public void delete(OnDeleteInterfaceStrategy strategy){
        strategy.delete();
    }

}
