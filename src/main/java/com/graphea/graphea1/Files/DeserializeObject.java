package com.graphea.graphea1.Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface DeserializeObject {

    default Object deserialize(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
