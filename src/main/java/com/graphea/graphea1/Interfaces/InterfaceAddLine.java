package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.paint.Color;

public interface InterfaceAddLine extends InterfaceAdd {
    SingletonProvider provider = SingletonProvider.getInstance();
    default void addLine (Vertex start, Vertex end) {
        Edge line = new Edge(start, end);

        start.registerObserver(line);
        end.registerObserver(line);

        start.setFill(Color.WHITE);
        end.setFill(Color.WHITE);

        SingletonGraph.getInstance().insertEdge(line);
        add(line);
    }
}
