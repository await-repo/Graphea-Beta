package com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class WindowDraggedStrategy implements OnDraggedInterfaceStrategy {
    private Parent root;
    private Stage stage;
    private SingletonWindow onMouse = SingletonWindow.getInstance();

    public WindowDraggedStrategy(Parent root, Stage stage) {
        this.root = root;
        this.stage = stage;
    }

    @Override
    public void mouseDragged () {
        root.setOnMouseDragged(evt -> {
            stage.setX(evt.getScreenX() - onMouse.getX());
            stage.setY(evt.getScreenY() - onMouse.getY());
        });
    }
}
