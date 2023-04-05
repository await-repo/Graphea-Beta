package com.graphea.graphea1.UI;

import com.graphea.graphea1.UI.Components.ButtonAction;
import com.graphea.graphea1.UI.Panes.*;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Index extends BorderPane {
    private TopPane top = new TopPane();
    private RightPane right = new RightPane();
    private LeftPane left = new LeftPane();
    private BottomPane bottom = new BottomPane();
    private CentralPane central = new CentralPane();

    public Index() {
        init();
    }

    public void init () {
        this.setTop(top);
        this.setCenter(central);
        this.setBottom(bottom);
        this.setLeft( left );
        this.setRight( right );
    }
}
