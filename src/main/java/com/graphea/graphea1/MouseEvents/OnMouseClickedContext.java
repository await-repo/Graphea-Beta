package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.OnClickedInterfaceStrategy;

public class OnMouseClickedContext {

    public void mouseClicked(OnClickedInterfaceStrategy strategy){
        strategy.mouseClicked();
    }

}
