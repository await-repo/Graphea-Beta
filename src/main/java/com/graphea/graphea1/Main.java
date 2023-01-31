package com.graphea.graphea1;

import com.graphea.graphea1.Singletons.Css.SingletonIndexCSS;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;

import java.io.Serializable;

public class Main extends Application implements Serializable {

    @Override
    public void start(Stage stage) {
        stage = new Loader("index.fxml", SingletonIndexCSS.getInstance());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}