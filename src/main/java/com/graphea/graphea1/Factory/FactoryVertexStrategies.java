package com.graphea.graphea1.Factory;

import com.graphea.graphea1.MouseEvents.*;
import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.CircleClickedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.CircleDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies.CircleEnteredStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.CircleExitedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.CirclePressedStrategy;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public class FactoryVertexStrategies implements AbstractFactory {
    private Vertex circle;

    public FactoryVertexStrategies(Vertex circle) {
        this.circle = circle;

        setOnMouseEntered();
        setOnMouseExited();
        setOnMouseClicked();
        setOnMousePressed();
        setOnMouseDragged();
    }

    @Override
    public void setOnMouseEntered() {
        new OnMouseEnteredContext().mouseEntered(new CircleEnteredStrategy(circle));
    }

    @Override
    public void setOnMouseExited() {
        new OnMouseExitedContext().mouseExited(new CircleExitedStrategy(circle));
    }

    @Override
    public void setOnMouseClicked() {
        new OnMouseClickedContext().mouseClicked(new CircleClickedStrategy(circle));
    }

    @Override
    public void setOnMousePressed() {
        new OnMousePressedContext().mousePressed(new CirclePressedStrategy(circle));
    }

    @Override
    public void setOnMouseDragged() {
        new OnMouseDraggedContext().mouseDragged(new CircleDraggedStrategy(circle));
    }
}
