package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.OnDraggedInterfaceStrategy;

public class OnMouseDraggedContext {

    public void mouseDragged(OnDraggedInterfaceStrategy strategy){
        strategy.mouseDragged();
    }
}
