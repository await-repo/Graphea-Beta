package com.graphea.graphea1.Functional;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import javafx.application.Platform;
import java.util.function.BiConsumer;

public class SingletonFunctionsMessages implements InterfaceWait {

    private static final SingletonFunctionsMessages INSTANCE = new SingletonFunctionsMessages();
    private SingletonProvider provider = SingletonProvider.getInstance();

    private SingletonFunctionsMessages(){};

    public static SingletonFunctionsMessages getInstance() {
        return INSTANCE;
    }

    private BiConsumer<String, Integer> messageFunction = (message, seconds) -> {
        while (seconds > 0) {
            Platform.runLater(() -> provider.getLblBottomPane().setText(message));
            waitMiliSeconds(1000);
            seconds--;
        }
        Platform.runLater(() -> provider.getLblBottomPane().setText(""));
    };

    public BiConsumer<String, Integer> getMessageFunction() {
        return messageFunction;
    }
    public void setMessageFunction(BiConsumer<String, Integer> messageFunction) {
        this.messageFunction = messageFunction;
    }
}
