package com.graphea.graphea1.Components.PopUp.PopUpStrategies.DeleteStrategies;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public class CircleDeleteStrategy implements OnDeleteInterfaceStrategy, InterfaceRemove {

    private Vertex circle;

    public CircleDeleteStrategy(Vertex circle) {
        this.circle = circle;
    }

    @Override
    public void delete() {
        circle.deleteObservers();
        SingletonGraph.getInstance().deleteVertex(circle);
        new Message(5, new Notification("Vertice " + circle + " Eliminado", "secondary"));
    }
}



/*
 public void delete() {
        this.setOnAction(event -> {
            circle.deleteObservers();
            SingletonGraph.getInstance().deleteVertex(circle);
            //Message msg = new Message(5, "Vertice Eliminado");
            new Message(5, new Notification("Vertice Eliminado", "secondary"));
        });
    }
*/
