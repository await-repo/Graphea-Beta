package com.graphea.graphea1.Components.PopUp;

import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Singletons.Providers.SingletonWindowCircle;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;
import javafx.scene.control.ContextMenu;

import com.graphea.graphea1.Observer.Observer;

public class PopUp extends ContextMenu implements Observer {

    private SingletonProvider provider = SingletonProvider.getInstance();
    private SingletonWindowCircle windowCircle = SingletonWindowCircle.getInstance();

    public void setCoords (double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void update(Vertex circle) {
        this.setCoords(
            windowCircle.getX() + provider.getSplitScrollLeft().getWidth() - 15,
            windowCircle.getY() + provider.getHeaderPane().getHeight()
        );
    }
}
