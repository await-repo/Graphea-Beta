package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;

public interface InterfaceRemove {

    default void remove (Object o) {
        SingletonProvider.getInstance().getCentralPane().getChildren().remove(o);
    }
}
