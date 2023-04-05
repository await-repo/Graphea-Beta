package com.graphea.graphea1.UI.Components.Interfaces;

import com.graphea.graphea1.Singletons.Figure.SingletonCircle;

public interface ShowCoords extends ShowMessage {
    SingletonCircle singleton = SingletonCircle.getInstance();

    default void onShowCoords() {
        singleton.setShowCoords( !singleton.isShowCoords() );
        if (singleton.isShowCoords())
            message("Mostrando Coordenadas de los Nodos", true);
        else
            message("", false);
    }
}
