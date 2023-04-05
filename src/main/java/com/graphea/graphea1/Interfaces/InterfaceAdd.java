package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import javafx.scene.Node;

public interface InterfaceAdd {

    default void add (Node o) {
        Global.getInstance().getCentralPane().getChildren().add(o);

        //SingletonProvider.getInstance().getCentralPane().getChildren().add(o);
    }
}
