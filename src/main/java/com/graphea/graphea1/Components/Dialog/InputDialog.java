package com.graphea.graphea1.Components.Dialog;

import com.graphea.graphea1.AddCSS;
import com.graphea.graphea1.MouseEvents.OnMouseDraggedContext;
import com.graphea.graphea1.MouseEvents.OnMousePressedContext;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.DialogDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.WindowDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.DialogPressedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.WindowPressedStrategy;
import com.graphea.graphea1.Singletons.Css.SingletonAlertCSS;
import com.graphea.graphea1.Singletons.Css.SingletonTextInputCSS;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseButton;
import javafx.stage.StageStyle;

public class InputDialog extends TextInputDialog {

    private OnMousePressedContext onMousePressedContext = new OnMousePressedContext();
    private OnMouseDraggedContext onMouseDraggedContext = new OnMouseDraggedContext();
    private SingletonWindow onMouse = SingletonWindow.getInstance();
    private String title;

    public InputDialog(String title) {
        this.title = title;
        init();
    }

    public void init () {
        this.initStyle(StageStyle.UNDECORATED);
        this.setHeaderText(title);
        this.setGraphic(null);
        Button rename = (Button) this.getDialogPane().lookupButton(ButtonType.OK);
        Button cancel = (Button) this.getDialogPane().lookupButton(ButtonType.CANCEL);
        rename.setText("Asignar Nombre");
        cancel.setText("Cancelar");

        AddCSS css = new AddCSS(this.getDialogPane().getScene());
        css.init(SingletonTextInputCSS.getInstance().getCssList());

        onMousePressedContext.mousePressed(new DialogPressedStrategy(this.getDialogPane()));
        onMouseDraggedContext.mouseDragged(new DialogDraggedStrategy(this.getDialogPane(), this));
    }
}
