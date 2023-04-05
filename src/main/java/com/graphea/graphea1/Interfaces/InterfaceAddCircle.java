package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public interface InterfaceAddCircle extends InterfaceAdd {
    //SingletonProvider provider = SingletonProvider.getInstance();

    Global provider = Global.getInstance();

    default void addCircle (double xAxis, double yAxis) {
        Vertex circle = new Vertex(
                xAxis - provider.getSplitScrollLeft().getWidth(),
                yAxis - provider.getHeaderPane().getHeight()
        );
        addCircle(circle);
    }

    default void addCircle (Vertex circle) {
        SingletonGraph.getInstance().insertVertex(circle);
        add(circle);
        add(circle.getCoords());
        add(circle.getName());
        provider.getTextAreaPane().appendText(">> Node " + circle + " Added \n");
    }
}
