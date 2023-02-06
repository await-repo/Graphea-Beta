package com.graphea.graphea1.Files.OpenFileState;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceAddLine;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class StateReadeEdges implements State, InterfaceAddLine {
    Hashtable<String, Vertex> nodes;

    public StateReadeEdges(Hashtable<String, Vertex> nodes) {
        this.nodes = nodes;
    }

    public StateReadeEdges() {
    }

    @Override
    public void read(String line) {
        String edge[] = line.split("-");
        Edge e = new Edge(nodes.get(edge[0]), nodes.get(edge[1]));
        addLine(e);
    }

}
