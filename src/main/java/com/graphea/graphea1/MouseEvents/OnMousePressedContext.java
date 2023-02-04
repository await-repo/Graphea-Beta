package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.OnMouseInterfaceStrategy;

public class OnMousePressedContext {

    public void mousePressed(OnMouseInterfaceStrategy strategy){
        strategy.mousePressed();
    }
}
