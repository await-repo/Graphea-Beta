package com.graphea.graphea1.MouseEvents;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowInterface;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.Parent;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;

public class OnMouseDragged {
    private SingletonWindowInterface onMouse;
    private SingletonProvider provider = SingletonProvider.getInstance();
    private SingletonWindow window = SingletonWindow.getInstance();
    private SingletonWindowCircle windowCircle = SingletonWindowCircle.getInstance();

    public OnMouseDragged (SingletonWindowInterface onMouse) {
        this.onMouse = onMouse;
    }

    public void OnMouseDragged (Parent root, Stage stage) {
        root.setOnMouseDragged(evt -> {
            stage.setX(evt.getScreenX() - onMouse.getX());
            stage.setY(evt.getScreenY() - onMouse.getY());
        });
    }

    public void OnMouseDragged (Vertex circle) {
        circle.setOnMouseDragged(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                windowCircle.setX(mouseEvent.getSceneX() - provider.getSplitScrollLeft().getWidth());
                windowCircle.setY(mouseEvent.getSceneY() - provider.getHeaderPane().getHeight());

                circle.getCoords().setCoords(windowCircle.getX() + 15, windowCircle.getY());
                circle.getPopUpMenu().setCoords(mouseEvent.getSceneX() - 15, mouseEvent.getSceneY());

                circle.setTranslate(windowCircle.getX() - window.getX(), windowCircle.getY() - window.getY());
                circle.setAxis(windowCircle.getX(), windowCircle.getY());
                circle.moveEdgesAdjacents();
            }
        });
    }
}
