package com.graphea.graphea1.Singletons.DataStructure;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AuxiliarGraph implements Serializable {
    private List<Vertex> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();

    public List<Vertex> getNodes() {
        return nodes;
    }

    public AuxiliarGraph() {}

    public AuxiliarGraph(List<Vertex> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public void setNodes(List<Vertex> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
