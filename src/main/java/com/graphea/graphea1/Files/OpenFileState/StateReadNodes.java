package com.graphea.graphea1.Files.OpenFileState;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceAddCircle;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class StateReadNodes implements State, InterfaceAddCircle {
    Hashtable<String, Vertex> nodes;

    public StateReadNodes(Hashtable<String, Vertex> nodes) {
        this.nodes = nodes;
    }

    public StateReadNodes() {
    }

    @Override
    public void read(String line) {
        String key = line;
        line = line.replace("{","");
        line = line.replace("}","");
        String coords[] = line.split(",");
        Vertex circle = new Vertex(Double.parseDouble(coords[0]), Double.parseDouble(coords[1]));
        nodes.put(key, circle);
        addCircle(circle);
    }

}
