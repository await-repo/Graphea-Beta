package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public interface InterfaceAddCircle extends InterfaceAdd {
    SingletonProvider provider = SingletonProvider.getInstance();
    default void addCircle (double xAxis, double yAxis) {
        Vertex circle = new Vertex(
                xAxis - provider.getSplitScrollLeft().getWidth(),
                yAxis - provider.getHeaderPane().getHeight()
        );
        SingletonGraph.getInstance().insertVertex(circle);
        add(circle);
    }
}
