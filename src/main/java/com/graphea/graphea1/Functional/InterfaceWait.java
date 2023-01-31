package com.graphea.graphea1.Functional;

public interface InterfaceWait {
    default public void waitMiliSeconds(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
