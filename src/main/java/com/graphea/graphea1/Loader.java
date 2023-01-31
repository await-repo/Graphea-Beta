package com.graphea.graphea1;

import com.graphea.graphea1.Singletons.Css.SingletonCSS;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import com.graphea.graphea1.MouseEvents.OnMouseDragged;
import com.graphea.graphea1.MouseEvents.OnMousePressed;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Serializable;

public class Loader extends Stage implements Serializable {
    private SingletonCSS singletonStyle;
    private String path;
    SingletonWindow singleton = SingletonWindow.getInstance();
    OnMousePressed onMousePressed = new OnMousePressed(singleton);
    OnMouseDragged onMouseDragged = new OnMouseDragged(singleton);

    public Loader(String path, SingletonCSS singletonStyle) {
        this.path = path;
        this.singletonStyle = singletonStyle;
        init();
    }

    private void init () {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(path));
            Scene scene = new Scene(root);
            AddCSS css = new AddCSS(scene);
            css.init(singletonStyle.getCssList());
            this.setScene(scene);
            onMousePressed.OnMousePressed(root);
            onMouseDragged.OnMouseDragged(root, this);
        } catch (Exception evt) {
            System.out.println("Cant load window");
        }
    }
}
