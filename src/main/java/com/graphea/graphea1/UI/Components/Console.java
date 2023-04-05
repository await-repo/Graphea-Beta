package com.graphea.graphea1.UI.Components;

import com.graphea.graphea1.Singletons.Providers.Global;
import javafx.scene.control.TextArea;

public class Console extends TextArea {

    private Global provider = Global.getInstance();

    public Console() {
        provider.setTextAreaPane(this);
        this.setMinHeight(0);
    }
}
