package com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Singletons.Providers.SingletonWindow;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.input.MouseButton;

public class CircleDraggedStrategy implements OnDraggedInterfaceStrategy{

    private SingletonProvider provider = SingletonProvider.getInstance();
    private SingletonWindow window = SingletonWindow.getInstance();
    private SingletonWindowCircle windowCircle = SingletonWindowCircle.getInstance();
    private Vertex circle;

    public CircleDraggedStrategy(Vertex circle) {
        this.circle = circle;
    }

    @Override
    public void mouseDragged () {
        circle.setOnMouseDragged(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                windowCircle.setX(mouseEvent.getSceneX() - provider.getSplitScrollLeft().getWidth());
                windowCircle.setY(mouseEvent.getSceneY() - provider.getHeaderPane().getHeight());

                circle.moveObservers();

                circle.setTranslate(windowCircle.getX() - window.getX(), windowCircle.getY() - window.getY());
                circle.setAxis(windowCircle.getX(), windowCircle.getY());
            }
        });
    }
}
