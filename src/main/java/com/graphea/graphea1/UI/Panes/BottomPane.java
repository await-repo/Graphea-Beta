package com.graphea.graphea1.UI.Panes;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Panes.bottomComponents.ContainerNotification;
import com.graphea.graphea1.UI.Panes.bottomComponents.Index;
import javafx.scene.layout.AnchorPane;

public class BottomPane extends AnchorPane {

    private Index flowPane = new Index();

    private ContainerNotification primary = new ContainerNotification("primary");
    private ContainerNotification secondary = new ContainerNotification("secondary");
    private ContainerNotification danger = new ContainerNotification("danger");
    private ContainerNotification command = new ContainerNotification("command");


    private Global provider = Global.getInstance();


    public BottomPane() {

        this.setId("BottomPane");

        //flowPane.setHgap(10);
        primary.setPrefWidth(0);


        flowPane.setMinHeight(15);
        flowPane.setPrefHeight(15);
        flowPane.setMaxHeight(15);

        flowPane.getChildren().addAll(primary, secondary, danger, command);

        this.setMinHeight(10);
        this.getChildren().add(flowPane);

        provider.setIndex(flowPane);
    }
}
