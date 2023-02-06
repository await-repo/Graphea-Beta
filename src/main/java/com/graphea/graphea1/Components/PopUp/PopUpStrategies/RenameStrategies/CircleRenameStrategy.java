package com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies;

import com.graphea.graphea1.Components.Dialog.InputDialog;
import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;

public class CircleRenameStrategy extends MenuItem implements OnRenameInterfaceStrategy, InterfacePin {

    private Vertex circle;
    private String Title;
    private InputDialog Input;

    public CircleRenameStrategy(String title, Vertex circle) {
        this.setText(title);
        this.circle = circle;
        this.Input = new InputDialog("Ingresa el nombre para el Vértice");
    }

    @Override
    public MenuItem rename() {
        this.setOnAction(event -> {
           Input.showAndWait().ifPresent(
               (name) -> {
                   circle.setValue(name);
               }
           );
           Input.getEditor().clear();
        });
        return this;
    }
}
