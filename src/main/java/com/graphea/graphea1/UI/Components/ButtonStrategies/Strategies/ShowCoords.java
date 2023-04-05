package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.UI.Components.ButtonStrategies.Context.ButtonStrategy;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import javafx.event.ActionEvent;

public class ShowCoords implements ShowMessage, ButtonStrategy {
    SingletonCircle singleton = SingletonCircle.getInstance();

    public void action(ActionEvent e) {
        singleton.setShowCoords( !singleton.isShowCoords() );
        if (singleton.isShowCoords())
            message(new Notification("Mostrando Coordenadas de los Nodos", "primary"), true);
        else
            message(new Notification("Mostrando Coordenadas de los Nodos", "primary"), false);
            //message(new Notification("Ocultando coordenadas", "danger"), false);
    }
}
