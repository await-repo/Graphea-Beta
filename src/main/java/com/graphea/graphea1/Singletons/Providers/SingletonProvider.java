package com.graphea.graphea1.Singletons.Providers;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.io.Serializable;

public class SingletonProvider implements Serializable {
    private static SingletonProvider INSTANCE = new SingletonProvider();

    private ScrollPane splitScrollLeft;
    private AnchorPane headerPane;
    private TextArea textAreaPane;
    private AnchorPane CentralPane;
    private Label lblBottomPane;

    private SingletonProvider(){}

    public static SingletonProvider getInstance() {
        return INSTANCE;
    }

    public static SingletonProvider set (
            ScrollPane splitScrollLeft,
            AnchorPane headerPane,
            TextArea textAreaPane,
            AnchorPane CentralPane,
            Label lblBottomPane) {

        INSTANCE.setSplitScrollLeft(splitScrollLeft);
        INSTANCE.setHeaderPane(headerPane);
        INSTANCE.setTextAreaPane(textAreaPane);
        INSTANCE.setCentralPane(CentralPane);
        INSTANCE.setLblBottomPane(lblBottomPane);

        return INSTANCE;
    }


    public Label getLblBottomPane() {
        return lblBottomPane;
    }

    public void setLblBottomPane(Label lblBottomPane) {
        this.lblBottomPane = lblBottomPane;
    }

    public ScrollPane getSplitScrollLeft() {
        return splitScrollLeft;
    }

    public void setSplitScrollLeft(ScrollPane splitScrollLeft) {
        this.splitScrollLeft = splitScrollLeft;
    }

    public AnchorPane getHeaderPane() {
        return headerPane;
    }

    public void setHeaderPane(AnchorPane headerPane) {
        this.headerPane = headerPane;
    }

    public TextArea getTextAreaPane() {
        return textAreaPane;
    }

    public void setTextAreaPane(TextArea textAreaPane) {
        this.textAreaPane = textAreaPane;
    }

    public AnchorPane getCentralPane() {
        return CentralPane;
    }

    public void setCentralPane(AnchorPane centralPane) {
        CentralPane = centralPane;
    }
}
