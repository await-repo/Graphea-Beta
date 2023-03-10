package com.graphea.graphea1.Observer;

import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public interface Observer {
    public void move(Vertex circle);

    public void delete(Vertex circle);
}
