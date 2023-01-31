package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.paint.Color;

public interface InterfacePin extends InterfaceAddLine {
    SingletonCircle singleton = SingletonCircle.getInstance();

    default void pin (Vertex node) {
        provider.getTextAreaPane().appendText("PIN: " + node.getxAxis() + ", " + node.getyAxis() + "\n");
        node.setFill(Color.CYAN);

        if (singleton.getStart() == null) {
            singleton.setStart(node);
        } else {
            addLine(singleton.getStart(), node);
            singleton.setStart(null);
            singleton.setEnd(null);
        }
    }
}
