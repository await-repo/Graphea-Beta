package com.graphea.graphea1.Functional;

public class Message extends Thread {
    private SingletonFunctionsMessages singletonMessages = SingletonFunctionsMessages.getInstance();
    private int seconds;
    private String message;

    public Message(int seconds, String message) {
        this.seconds = seconds;
        this.message = message;
        init();
    }

    public void init () {
        Thread thread = new Thread(() -> singletonMessages.getMessageFunction().accept(message, seconds));
        thread.start();
    }
}
