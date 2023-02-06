package com.graphea.graphea1.Files.SaveFileState;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceAddLine;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class StateSaveEdges implements State, InterfaceAddLine {

    @Override
    public void write(FileWriter writer) {
        try {
            writer.write("@edges\n");
            for (Edge edge: SingletonGraph.getInstance().getEdges()) {
                writer.write(edge.toString() + "\n");
            }
        } catch (IOException e) {
            new Message(5, "Un error inesperado a ocurrido al crear las Aristas");
            e.printStackTrace();
        }

    }
}
