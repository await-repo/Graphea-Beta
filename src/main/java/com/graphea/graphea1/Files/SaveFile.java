package com.graphea.graphea1.Files;

import com.graphea.graphea1.Files.SaveFileState.Context;
import com.graphea.graphea1.Files.SaveFileState.StateSaveEdges;
import com.graphea.graphea1.Files.SaveFileState.StateSaveNodes;
import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private File GraphFile;
    private StateSaveNodes readNodes = new StateSaveNodes();
    private StateSaveEdges readeEdges = new StateSaveEdges();
    private Context context = new Context();

    public void createFile () {
        try {
            FileChooser chooser = new FileChooser();
            GraphFile = chooser.showSaveDialog(null);
            if (GraphFile.createNewFile()) {
                //new Message(5,"Archivo Creado: " + GraphFile.getName());
                new Message(5,new Notification("Archivo Creado: " + GraphFile.getName(), "secondary"));
            } else {
                //new Message(5,"El archivo realmente ya existe");
                new Message(5,new Notification("El archivo realmente ya existe", "secondary"));
            }
        } catch (IOException e) {
            //new Message(5,"Ha ocurrido un error Inesperado");
            new Message(5, new Notification("Ha ocurrido un error Inesperado", "danger"));
            e.printStackTrace();
        }
    }

    public void saveFile () {
        try {
            FileWriter Writer = new FileWriter(GraphFile.getAbsolutePath());
            context.setState(readNodes);
            context.write(Writer);
            context.setState(readeEdges);
            context.write(Writer);
            Writer.close();
            //new Message(5,"Grafo guardado satisfactoriamente en " + GraphFile.getName());
            new Message(5,new Notification("Grafo guardado satisfactoriamente en " + GraphFile.getName(), "secondary"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
