package com.graphea.graphea1.Components.PopUp;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.DeleteContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.PinContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.RenameContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.EdgeDeleteStrategy;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies.EdgeRenameStrategy;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;

import java.io.Serializable;

public class PopUpLine<T extends Edge> extends PopUp implements Serializable {

    private DeleteContext DeleteContext = new DeleteContext();
    private RenameContext RenameContext = new RenameContext();

    public PopUpLine(Edge line) {
        this.getItems().add( DeleteContext.delete(new EdgeDeleteStrategy("Eliminar", line)) );
        this.getItems().add( RenameContext.rename(new EdgeRenameStrategy("Nombrar", line)) );
    }

}
