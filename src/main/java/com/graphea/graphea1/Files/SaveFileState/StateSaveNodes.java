package com.graphea.graphea1.Files.SaveFileState;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceAddCircle;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class StateSaveNodes implements State, InterfaceAddCircle {

    @Override
    public void write(FileWriter writer) {
        try {
            writer.write("@nodes\n");
            for (Vertex node: SingletonGraph.getInstance().getNodes()) {
                writer.write(node.toString() + "\n");
            }
        } catch (IOException e) {
            //new Message(5,"Un error inesperado a ocurrido al crear los Vertices");
            new Message(5,new Notification("Un error inesperado a ocurrido al crear los Vertices", "danger"));
            e.printStackTrace();
        }
    }
}
