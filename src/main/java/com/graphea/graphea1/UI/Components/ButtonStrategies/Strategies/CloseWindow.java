package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Loader;
import com.graphea.graphea1.Singletons.Css.SingletonAlertCSS;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CloseWindow implements ButtonStrategy {

    public void action(ActionEvent e) {
        Stage stage = new Loader("views/alert-view.fxml", SingletonAlertCSS.getInstance());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false); //
        stage.show();
    }
}
