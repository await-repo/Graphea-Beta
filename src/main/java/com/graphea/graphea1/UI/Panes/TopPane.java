package com.graphea.graphea1.UI.Panes;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Components.ButtonAction;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies.*;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TopPane extends AnchorPane {
    private Label header = new Label();
    private HBox operations = new HBox(8);
    private Global provider = Global.getInstance();

    private boolean isMaximized = false;
    private boolean isMinimized = false;

    private MenuBar menuBar = new MenuBar();

    public TopPane () {
        provider.setHeaderPane(this);

        initLabel();
        initMenuBar();
        initVBox();
        this.getChildren().addAll(header, menuBar, operations);
    }

    public void initMenuBar () {
        Menu files = new Menu("Archivo");

        MenuItem saveGraph = new MenuItem("Guardar Grafo");
        saveGraph.setOnAction(e -> new SaveGraph().action(e));

        MenuItem openGraph = new MenuItem("Abrir Grafo");
        openGraph.setOnAction(e -> new OpenGraph().action(e));

        MenuItem autoSave = new MenuItem("Autoguardado (Desactivado)");

        files.getItems().addAll(saveGraph, openGraph, autoSave);

        menuBar.getMenus().addAll(files);

        AnchorPane.setTopAnchor(menuBar, 6.0);
        AnchorPane.setLeftAnchor(menuBar, 80.0);
        AnchorPane.setBottomAnchor(menuBar, 4.0);
    }

    public void initLabel () {
        this.setId("headerPane");
        this.header.setText("Graphea");
        AnchorPane.setTopAnchor(header, 5.0);
        AnchorPane.setLeftAnchor(header, 10.0);
        AnchorPane.setBottomAnchor(header, 5.0);
    }

    public void initVBox() {

        operations.getChildren().addAll(
                new ButtonAction( "button-purple", new MinimizeWindow() ), //MINIMIZE
                new ButtonAction( "button-cyan", new MaximizeWindow() ), //MAXIMMIZE
                new ButtonAction( "button-red", new CloseWindow() ) //CLOSE
        );
        AnchorPane.setTopAnchor(operations, 5.0);
        AnchorPane.setRightAnchor(operations, 5.0);
        AnchorPane.setBottomAnchor(operations, 5.0);
    }

}
