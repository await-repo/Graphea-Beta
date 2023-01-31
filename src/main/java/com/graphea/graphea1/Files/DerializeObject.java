package com.graphea.graphea1.Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public interface DerializeObject {

    default void serialize(Object graph, String fileName)  {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(graph);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
