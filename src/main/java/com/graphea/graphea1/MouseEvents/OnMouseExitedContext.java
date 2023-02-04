package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.OnExitedInterfaceStrategy;

public class OnMouseExitedContext {

    public void mouseExited(OnExitedInterfaceStrategy strategy){
        strategy.mouseExited();
    }
}
