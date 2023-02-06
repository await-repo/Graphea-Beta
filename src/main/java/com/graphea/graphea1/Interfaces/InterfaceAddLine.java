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
        addLine(line);
        start.setFill(Color.WHITE);
        end.setFill(Color.WHITE);
    }

    default void addLine (Edge line) {
        line.getStart().registerObserver(line);
        line.getEnd().registerObserver(line);
        SingletonGraph.getInstance().insertEdge(line);
        add(line);
        add(line.getName());
        provider.getTextAreaPane().appendText(">> Edge " + line + " Added \n");
    }
}
