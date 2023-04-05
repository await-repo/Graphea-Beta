package com.graphea.graphea1.UI.Panes;

import com.graphea.graphea1.UI.Components.Split;
import com.graphea.graphea1.UI.pages.BottomSplitPane;
import com.graphea.graphea1.UI.pages.TopSplitPane;
import javafx.geometry.Orientation;

import java.util.Arrays;

public class CentralPane extends Split {
    private TopSplitPane top = new TopSplitPane();
    private BottomSplitPane bottom = new BottomSplitPane();

    public CentralPane() {
        init(
            Orientation.VERTICAL,
            0.8145,
            top,
            bottom
        );

    }
}
