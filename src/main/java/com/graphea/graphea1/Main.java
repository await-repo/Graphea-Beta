package com.graphea.graphea1;

import com.graphea.graphea1.Singletons.Css.SingletonIndexCSS;
import com.graphea.graphea1.UI.Index;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;

import java.io.Serializable;

public class Main extends Application implements Serializable {

    /*
    try {
            stage.setTitle("AnchorPane");
            BorderPane Index = new Index();
            Scene scene = new Scene(Index, 1200, 650);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    */


    /*
    stage.setTitle("AnchorPane");
            stage.initStyle(StageStyle.UNDECORATED);
            BorderPane root = new Index();
            Scene scene = new Scene(root, 1200, 650);
            AddCSS css = new AddCSS(scene);
            css.init(SingletonIndexCSS.getInstance().getCssList());
            stage.setScene(scene);
            stage.show();
    */

    @Override
    public void start(Stage stage) {
        try {
            stage = new Load(new Index(), SingletonIndexCSS.getInstance());
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    @Override
    public void start(Stage stage) {
        stage = new Loader("Index.fxml", SingletonIndexCSS.getInstance());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.show();
    }
    */

    public static void main(String[] args) {
        launch();
    }
}