package com.graphea.graphea1.UI.pages;

import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Components.Anchor;
import com.graphea.graphea1.UI.Components.Scroll;
import com.graphea.graphea1.UI.Components.Split;
import com.graphea.graphea1.UI.ControlPanels.Control;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Arrays;

public class TopSplitPane extends Split {

    Global provider = Global.getInstance();
    Scroll left = new Scroll(new Control());


    Anchor centralPane = new Anchor();



    Scroll right = new Scroll(centralPane);

    public TopSplitPane () {

        centralPane.setId("CentralPane");

        centralPane.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.SPACE) {
                event.consume();
                System.out.println("SPACE");
            } else if (event.getCode() == KeyCode.DIGIT4) {
                event.consume();
                System.out.println("CUATRO");
            }
        });

        left.setId("splitScrollLeft");
        right.setId("splitScrollRight");

        provider.setSplitScrollLeft(left);
        init(
                Orientation.HORIZONTAL,
                0.2149,
                left,
                right
        );
    }
}
