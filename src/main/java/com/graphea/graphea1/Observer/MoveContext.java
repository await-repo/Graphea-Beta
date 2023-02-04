package com.graphea.graphea1.Observer;

import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.OnClickedInterfaceStrategy;

public class MoveContext {

    public void mouseClicked(OnClickedInterfaceStrategy strategy) {
        strategy.mouseClicked();
    }

}
