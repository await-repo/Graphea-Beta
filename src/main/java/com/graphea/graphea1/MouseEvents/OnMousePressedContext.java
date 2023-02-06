package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.OnPressedInterfaceStrategy;

public class OnMousePressedContext {

    public void mousePressed(OnPressedInterfaceStrategy strategy){
        strategy.mousePressed();
    }
}
