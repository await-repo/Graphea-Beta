package com.graphea.graphea1.Singletons.Css;

import java.util.ArrayList;
import java.util.List;

public class SingletonTextInputCSS implements SingletonCSS {
    private static final SingletonTextInputCSS INSTANCE = new SingletonTextInputCSS();
    private List<String> cssList = new ArrayList<>();

    private SingletonTextInputCSS() {
        init();
    }

    public static SingletonTextInputCSS getInstance() {
        return INSTANCE;
    }

    private void init () {
        cssList.add("styles/inputDialog.css");
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
