package com.graphea.graphea1.UI.Components.Interfaces;

import com.graphea.graphea1.Singletons.Providers.Global;

public interface RemoveAll {
    Global provider = Global.getInstance();

    default void onRemoveAll() {
        provider.getCentralPane().getChildren().clear();
    }
}
