package com.graphea.graphea1.Interfaces;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;

public interface InterfaceRemove {

    Global provider = Global.getInstance();
    default void remove (Object o) {
        provider.getCentralPane().getChildren().remove(o);
    }
}
