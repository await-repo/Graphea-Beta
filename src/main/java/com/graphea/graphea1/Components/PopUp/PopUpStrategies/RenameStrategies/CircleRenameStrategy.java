package com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies;

import com.graphea.graphea1.Components.Dialog.InputDialog;
import com.graphea.graphea1.Interfaces.InterfacePin;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;

public class CircleRenameStrategy implements OnRenameInterfaceStrategy, InterfacePin {

    private Vertex circle;
    private InputDialog Input;

    public CircleRenameStrategy(Vertex circle) {
        this.circle = circle;
        this.Input = new InputDialog("Ingresa el nombre para el Vértice");
    }

    @Override
    public void rename() {
        Input.showAndWait().ifPresent(
                (name) -> {
                    circle.setValue(name);
                }
        );
        Input.getEditor().clear();
    }
}
