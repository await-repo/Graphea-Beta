package com.graphea.graphea1.Singletons.Providers;

import com.graphea.graphea1.UI.Panes.bottomComponents.Index;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

public class Global {
    private static Global INSTANCE = new Global();

    private ScrollPane splitScrollLeft;
    private AnchorPane headerPane;
    private TextArea textAreaPane;
    private AnchorPane CentralPane;
    private Label lblBottomPane;

    private Index index;

    private Global () {}

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public static Global getInstance() {
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
