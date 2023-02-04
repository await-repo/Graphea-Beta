package com.graphea.graphea1;

import com.graphea.graphea1.Singletons.Css.SingletonCSS;
import com.graphea.graphea1.MouseEvents.OnMouseDraggedContext;
import com.graphea.graphea1.MouseEvents.OnMousePressedContext;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.WindowDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.WindowPressedStrategy;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Serializable;

public class Loader extends Stage implements Serializable {
    private SingletonCSS singletonStyle;
    private String path;
    OnMousePressedContext onMousePressedContext = new OnMousePressedContext();
    OnMouseDraggedContext onMouseDraggedContext = new OnMouseDraggedContext();

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
            onMousePressedContext.mousePressed(new WindowPressedStrategy(root));
            onMouseDraggedContext.mouseDragged(new WindowDraggedStrategy(root, this));
        } catch (Exception evt) {
            System.out.println("Cant load window");
            System.err.println(evt.getMessage());
        }
    }
}
