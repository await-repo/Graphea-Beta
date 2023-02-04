package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteContextStrategy;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.PinStrategies.OnPinInterfaceStrategy;
import javafx.scene.control.MenuItem;

public class PinContext {

    public MenuItem pin(OnPinInterfaceStrategy strategy){
        return strategy.pin();
    }

}
