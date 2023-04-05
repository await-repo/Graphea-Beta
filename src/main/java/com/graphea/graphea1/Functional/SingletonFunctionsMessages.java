package com.graphea.graphea1.Functional;

import com.graphea.graphea1.Singletons.Providers.Global;
import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;
import javafx.application.Platform;
import java.util.function.BiConsumer;

public class SingletonFunctionsMessages implements InterfaceWait {

    private static final SingletonFunctionsMessages INSTANCE = new SingletonFunctionsMessages();

    //private SingletonProvider provider = SingletonProvider.getInstance();
    private Global provider = Global.getInstance();

    private SingletonFunctionsMessages(){};

    public static SingletonFunctionsMessages getInstance() {
        return INSTANCE;
    }

    private BiConsumer<Notification, Integer> messageFunction = (notification, seconds) -> {
        Platform.runLater(() -> provider.getIndex().getPaneById(notification.getType()).add(notification));
        waitMiliSeconds(seconds * 1000);
        Platform.runLater(() -> provider.getIndex().getPaneById(notification.getType()).removeNotification(notification) );
    };

    public BiConsumer<Notification, Integer> getMessageFunction() {
        return messageFunction;
    }
    public void setMessageFunction(BiConsumer<Notification, Integer> messageFunction) {
        this.messageFunction = messageFunction;
    }
}
