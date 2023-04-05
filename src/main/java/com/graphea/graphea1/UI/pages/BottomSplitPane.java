package com.graphea.graphea1.UI.pages;

import com.graphea.graphea1.UI.Components.Console;
import com.graphea.graphea1.UI.Components.Split;
import javafx.geometry.Orientation;
import javafx.scene.layout.AnchorPane;

import java.util.Arrays;

public class BottomSplitPane extends Split {

    public BottomSplitPane() {
        init(
                Orientation.HORIZONTAL,
                0,
                new Console()
        );
    }
}
