package com.graphea.graphea1.Interfaces;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public interface InterfaceUndecorated {

    default public void StageStyle (Stage stage) {
        stage.initStyle(StageStyle.UNDECORATED);
    }
}
