package com.graphea.graphea1.Components.PopUp;

import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.DeleteContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.PinContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.ContextStrategies.RenameContext;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies.EdgeDeleteStrategy;
import com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies.EdgeRenameStrategy;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.SaveGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import javafx.scene.control.MenuItem;

import java.io.Serializable;

public class PopUpLine<T extends Edge> extends PopUp implements Serializable {

    private DeleteContext DeleteContext = new DeleteContext();
    private RenameContext RenameContext = new RenameContext();

    public PopUpLine(Edge line) {

        MenuItem remove = new MenuItem("Eliminar");
        remove.setOnAction(e -> new EdgeDeleteStrategy(line).delete());


        MenuItem rename = new MenuItem("Nombrar");
        rename.setOnAction(e -> new EdgeRenameStrategy(line).rename());

        this.getItems().addAll(remove, rename);
    }

}
