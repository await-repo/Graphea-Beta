package com.graphea.graphea1.Components.PopUp;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteContextStrategy.DeleteContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteContextStrategy.PinContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.EdgeDeleteStrategy;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;

import java.io.Serializable;

public class PopUpLine<T extends Edge> extends PopUp implements Serializable {

    private DeleteContext DeleteContext = new DeleteContext();
    private PinContext PinContext = new PinContext();

    public PopUpLine(Edge line) {
        this.getItems().add( DeleteContext.delete(new EdgeDeleteStrategy("Eliminar", line)) );
    }

}
