package com.graphea.graphea1;

import com.graphea.graphea1.Components.Text.TextName;
import com.graphea.graphea1.Files.OpenFile;
import com.graphea.graphea1.Files.SaveFile;
import com.graphea.graphea1.Interfaces.InterfaceAddLine;
import com.graphea.graphea1.Singletons.Css.SingletonAlertCSS;
import com.graphea.graphea1.Singletons.Figure.SingletonCircle;
import com.graphea.graphea1.Singletons.Figure.SingletonLine;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Components.Text.TextCoords;
import com.graphea.graphea1.Interfaces.InterfaceAddCircle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller implements InterfaceAddCircle, InterfaceAddLine {

    @FXML
    private Button close;
    @FXML
    private ScrollPane splitScrollLeft;
    @FXML
    private ScrollPane splitScrollRight;
    @FXML
    private AnchorPane headerPane;
    @FXML
    private AnchorPane CentralPane;
    @FXML
    private TextArea textAreaPane;
    @FXML
    private Button repaintGraph;
    @FXML
    private Button showCoords;
    @FXML
    private Button saveGraph;
    @FXML
    private Button openGraph;
    @FXML
    private Label lblBottomPane;
    @FXML
    private FlowPane BottomPane;

    private SingletonCircle singleton = SingletonCircle.getInstance();
    private SingletonLine singletonL = SingletonLine.getInstance();

    //private Stage stage;




    @FXML
    protected void onCloseWindow(ActionEvent e) {
        Stage stage = new Loader("views/alert-view.fxml", SingletonAlertCSS.getInstance());

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false); //
        stage.show();
    }

    @FXML
    protected void onCloseApp(ActionEvent e) {
        Platform.exit(); //Cerramos toda la aplicacion
    }

    @FXML
    protected void onCloseAlert(ActionEvent e) {
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onMouseGenerate(MouseEvent e) {
        if (e.getButton() == MouseButton.PRIMARY) {

        }
        if (e.getButton() == MouseButton.SECONDARY) {
            if (!singleton.isInside() && !singletonL.isInside()) {
                addCircleInto(e.getSceneX(), e.getSceneY());
            }
        }
    }

    @FXML
    protected void onRepaint(ActionEvent e) {
        CentralPane.getChildren().clear();
    }

    @FXML
    protected void onShowCoords(ActionEvent e) {
        singleton.setShowCoords( !singleton.isShowCoords() );
        if (singleton.isShowCoords())
            message("Ocultar Coordenadas", "Mostrando Coordenadas de los Nodos", true);
        else
            message("Mostrar Coordenadas", "", false);
    }

    @FXML
    protected void onOpenGraph(ActionEvent e) {
        OpenFile file = new OpenFile();
        file.readFile();
    }

    @FXML
    protected void onSaveGraph(ActionEvent e) {
        SaveFile file = new SaveFile();
        file.createFile();
        file.saveFile();
    }


    private void addCircleInto(double xAxis, double yAxis) {
        addCircle(xAxis, yAxis);
    }

    private void message (String msgButton, String msgLabel, boolean isVisible) {
        showCoords.setText(msgButton);
        lblBottomPane.setText(msgLabel);
        CentralPane.getChildren().forEach(node -> {
            if (node.getClass() == TextCoords.class || node.getClass() == TextName.class) {
                node.setVisible(isVisible);
            }
        });
    }

}