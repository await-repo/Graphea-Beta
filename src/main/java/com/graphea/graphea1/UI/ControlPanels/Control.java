package com.graphea.graphea1.UI.ControlPanels;

import com.graphea.graphea1.Components.Text.TextCoords;
import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Files.OpenFile;
import com.graphea.graphea1.Files.SaveFile;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Components.ButtonAction;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.OpenGraph;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.RemoveAll;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.SaveGraph;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.ShowCoords;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Control extends AnchorPane {

    VBox graph = new VBox(8);
    HBox files = new HBox(8);



    public Control() {
        initVBox();
        //initHBox();

        this.setPrefHeight(474);
        this.setPrefWidth(254);

        this.getChildren().addAll(graph, files);

        this.getStyleClass().add("bg-gray");
    }

    public void initVBox() {
        graph.getChildren().addAll(
                new ButtonAction( "Borrar Grafo", "button-red", 222, new RemoveAll() ),
                new ButtonAction( "Mostrar Coordenadas", "button-yellow", 222, new ShowCoords() )
        );
        AnchorPane.setTopAnchor(graph, 15.0);
        AnchorPane.setLeftAnchor(graph, 15.0);
    }

    /*
    public void initHBox() {
        files.getChildren().addAll(
                new ButtonAction("Guardar", "button-green", new SaveGraph() ),
                new ButtonAction( "Abrir Grafo", "button-blue", new OpenGraph() )
        );
        AnchorPane.setRightAnchor(files, 10.0);
        AnchorPane.setBottomAnchor(files, 8.0);
    }
    */


}
