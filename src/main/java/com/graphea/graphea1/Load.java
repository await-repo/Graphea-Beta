package com.graphea.graphea1;

import com.graphea.graphea1.MouseEvents.OnMouseDraggedContext;
import com.graphea.graphea1.MouseEvents.OnMousePressedContext;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.WindowDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.WindowPressedStrategy;
import com.graphea.graphea1.Singletons.Css.SingletonCSS;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Load extends Stage {
    private SingletonCSS singletonStyle;
    private BorderPane root;
    private OnMousePressedContext onMousePressedContext = new OnMousePressedContext();
    private OnMouseDraggedContext onMouseDraggedContext = new OnMouseDraggedContext();

    public Load(BorderPane root, SingletonCSS singletonStyle) {
        this.root = root;
        this.singletonStyle = singletonStyle;
        init();
    }

    private void init () {
        try {
            Scene scene = new Scene(root, 1250, 650);
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
