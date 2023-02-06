package com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.Parent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class DialogDraggedStrategy implements OnDraggedInterfaceStrategy {
    private DialogPane DialogPane;
    private TextInputDialog TextInputDialog;
    private SingletonWindow onMouse = SingletonWindow.getInstance();

    public DialogDraggedStrategy(DialogPane DialogPane, TextInputDialog TextInputDialog) {
        this.DialogPane = DialogPane;
        this.TextInputDialog = TextInputDialog;
    }

    @Override
    public void mouseDragged () {
        DialogPane.setOnMouseDragged(evt -> {
            TextInputDialog.setX(evt.getScreenX() - onMouse.getX());
            TextInputDialog.setY(evt.getScreenY() - onMouse.getY());
        });
    }
}
