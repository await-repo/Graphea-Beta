package com.graphea.graphea1.UI.Components.ButtonStrategies.Strategies;

import com.graphea.graphea1.Components.Text.TextCoords;
import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;

public interface ShowMessage {

    Global provider = Global.getInstance();

    default void message(Notification notification, boolean isVisible) {
        //provider.getLblBottomPane().setText(msgLabel);

        if (isVisible) {
            provider.getIndex().getPaneById(notification.getType()).add(notification);
        } else {
            provider.getIndex().getPaneById(notification.getType()).removeNotification(notification.getId());
        }

        provider.getCentralPane().getChildren().forEach(node -> {
            if (node.getClass() == TextCoords.class || node.getClass() == TextName.class) {
                node.setVisible(isVisible);
            }
        });
    }
}
