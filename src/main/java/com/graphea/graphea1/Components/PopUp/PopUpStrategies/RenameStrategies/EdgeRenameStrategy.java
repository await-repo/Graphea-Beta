package com.graphea.graphea1.Components.PopUp.PopUpStrategies.RenameStrategies;

import com.graphea.graphea1.Components.Dialog.InputDialog;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.MenuItem;

public class EdgeRenameStrategy extends MenuItem implements OnRenameInterfaceStrategy {
    private Edge line;
    private String Title;
    private InputDialog Input;

    public EdgeRenameStrategy(String title, Edge line) {
        this.setText(title);
        this.line = line;
        this.Input = new InputDialog("Ingresa el nombre para la Arista");
    }

    @Override
    public MenuItem rename() {
        this.setOnAction(event -> {
            Input.showAndWait().ifPresent(
                    (name) -> {
                        line.setValue(name);
                    }
            );
            Input.getEditor().clear();
        });
        return this;
    }
}
