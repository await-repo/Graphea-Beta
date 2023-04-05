package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import javafx.scene.control.MenuItem;

public class EdgeDeleteStrategy implements OnDeleteInterfaceStrategy, InterfaceRemove {
    private Edge line;

    public EdgeDeleteStrategy(Edge line) {
        this.line = line;
    }

    @Override
    public void delete() {
        SingletonGraph.getInstance().deleteEdge(line);
        remove(line);
        new Message(5, new Notification("Arista Eliminada", "secondary"));
    }
}
