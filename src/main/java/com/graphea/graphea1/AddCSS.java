package com.graphea.graphea1;

import javafx.scene.Scene;

import java.io.Serializable;
import java.util.List;

public class AddCSS implements Serializable {
    Scene scene;

    public AddCSS(Scene scene) {
        this.scene = scene;
    }

    public void init (List<String> list) {
        for (String path: list) {
            scene.getStylesheets().add( this.getClass().getResource(path).toExternalForm() );
        }
    }
}
