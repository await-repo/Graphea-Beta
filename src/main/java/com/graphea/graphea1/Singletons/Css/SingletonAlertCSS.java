package com.graphea.graphea1.Singletons.Css;

import java.util.ArrayList;
import java.util.List;

public class SingletonAlertCSS implements SingletonCSS {
    private static final SingletonAlertCSS INSTANCE = new SingletonAlertCSS();
    private List<String> cssList = new ArrayList<>();

    private SingletonAlertCSS() {
        init();
    }

    public static SingletonAlertCSS getInstance() {
        return INSTANCE;
    }

    private void init () {
        cssList.add("styles/alerts.css");
    }

    @Override
    public List<String> getCssList() {
        return cssList;
    }

    @Override
    public void setCssList(List<String> cssList) {
        this.cssList = cssList;
    }
}
