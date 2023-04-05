package com.graphea.graphea1.Components.PopUp.PopUpStrategies.PinStrategies;

import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.MenuItem;

public class CirclePinStrategy implements OnPinInterfaceStrategy, InterfacePin {

    private Vertex circle;

    public CirclePinStrategy(Vertex circle) {
        this.circle = circle;
    }

    @Override
    public void pin() {
        pin(circle);
    }
}
