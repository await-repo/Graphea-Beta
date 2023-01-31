package com.graphea.graphea1.Singletons.DataStructure;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Graph;

public class SingletonGraph extends Graph {
    private static final SingletonGraph INSTANCE = new SingletonGraph();

    private SingletonGraph(){}

    public static SingletonGraph getInstance() {
        return INSTANCE;
    }
}
