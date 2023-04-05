package com.graphea.graphea1.Files;

import com.graphea.graphea1.Files.OpenFileState.Context;
import com.graphea.graphea1.Files.OpenFileState.StateReadNodes;
import com.graphea.graphea1.Files.OpenFileState.StateReadeEdges;
import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Singletons.DataStructure.SingletonGraph;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.Hashtable;

public class OpenFile {

    private SingletonGraph Graph =  SingletonGraph.getInstance();
    private Hashtable<String, Vertex> nodes = new Hashtable<>();
    private StateReadNodes readNodes = new StateReadNodes(nodes);
    private StateReadeEdges readeEdges = new StateReadeEdges(nodes);
    private Context context = new Context();

    public void readFile () {

        try {
            FileChooser chooser = new FileChooser();
            File file = chooser.showOpenDialog(null);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case "@nodes": context.setState(readNodes); continue;
                    case "@edges": context.setState(readeEdges); continue;
                }
                context.read(line);
            }
            nodes = null;
            //new Message(5,"Grafo procesado satisfactoriamente");
            new Message(5,new Notification("Grafo procesado satisfactoriamente", "secondary"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
