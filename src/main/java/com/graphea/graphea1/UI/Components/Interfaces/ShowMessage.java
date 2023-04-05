package com.graphea.graphea1.UI.Components.Interfaces;

import com.graphea.graphea1.Components.Text.TextCoords;
import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Singletons.Providers.Global;

public interface ShowMessage {

    Global provider = Global.getInstance();

    default void message(String msgLabel, boolean isVisible) {
        provider.getLblBottomPane().setText(msgLabel);
        provider.getCentralPane().getChildren().forEach(node -> {
            if (node.getClass() == TextCoords.class || node.getClass() == TextName.class) {
                node.setVisible(isVisible);
            }
        });
    }
}
