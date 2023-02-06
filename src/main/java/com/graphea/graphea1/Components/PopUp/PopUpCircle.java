package com.graphea.graphea1.Components.PopUp;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.DeleteContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.PinContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.RenameContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.CircleDeleteStrategy;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.PinStrategies.CirclePinStrategy;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies.CircleRenameStrategy;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import com.graphea.graphea1.Interfaces.InterfacePin;

import java.io.Serializable;

public class PopUpCircle extends PopUp implements Serializable, InterfacePin {

    private DeleteContext DeleteContext = new DeleteContext();
    private PinContext PinContext = new PinContext();
    private RenameContext RenameContext = new RenameContext();

    public PopUpCircle(Vertex vertex) {
        this.getItems().add( DeleteContext.delete(new CircleDeleteStrategy("Eliminar", vertex)) );
        this.getItems().add( PinContext.pin(new CirclePinStrategy("Pin", vertex)) );
        this.getItems().add( RenameContext.rename(new CircleRenameStrategy("Nombrar", vertex)) );
    }

}
