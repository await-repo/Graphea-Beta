package com.graphea.graphea1.Singletons.Css;

import java.util.ArrayList;
import java.util.List;

public class SingletonIndexCSS implements SingletonCSS {
    private static final SingletonIndexCSS INSTANCE = new SingletonIndexCSS();
    private List<String> cssList = new ArrayList<>();

    private SingletonIndexCSS() {
        init();
    }

    public static SingletonIndexCSS getInstance() {
        return INSTANCE;
    }

    private void init () {
        cssList.add("styles/main.css");
        cssList.add("styles/scrollbar.css");
        cssList.add("styles/textarea.css");
        cssList.add("styles/buttons.css");
        cssList.add("styles/contextmenu.css");
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
