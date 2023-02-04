package com.graphea.graphea1.Components.PopUp.PopUpStrategies.PinStrategies;

import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.MenuItem;

public class CirclePinStrategy extends MenuItem implements OnPinInterfaceStrategy, InterfacePin {

    private Vertex circle;
    private String Title;

    public CirclePinStrategy(String title, Vertex circle) {
        this.setText(title);
        this.circle = circle;
    }

    @Override
    public MenuItem pin() {
        this.setOnAction(event -> pin(circle));
        return this;
    }
}
