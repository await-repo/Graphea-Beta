package com.graphea.graphea1.Functional;

import com.graphea.graphea1.UI.Panes.bottomComponents.Notification;

public class Message extends Thread {
    private SingletonFunctionsMessages singletonMessages = SingletonFunctionsMessages.getInstance();
    private int seconds;
    private Notification notification;

    public Message(int seconds, Notification notification) {
        this.seconds = seconds;
        this.notification = notification;
        init();
    }

    public void init () {
        Thread thread = new Thread(() -> singletonMessages.getMessageFunction().accept(notification, seconds));
        thread.start();
    }
}
