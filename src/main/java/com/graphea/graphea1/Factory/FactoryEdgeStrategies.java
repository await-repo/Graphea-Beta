package com.graphea.graphea1.Factory;

import com.graphea.graphea1.MouseEvents.*;
import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.CircleClickedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseClickedStrategies.EdgeClickedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseDraggedStrategies.CircleDraggedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies.CircleEnteredStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseEnteredStrategies.EdgeEnteredStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.CircleExitedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMouseExitedStrategies.EdgeExitedStrategy;
import com.graphea.graphea1.MousesEventsStrategies.onMousePressedStrategies.CirclePressedStrategy;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Edge;
import com.graphea.graphea1.dataEstructures.graphs.DirectedGraph.Vertex;

public class FactoryEdgeStrategies implements AbstractFactory {
    private Edge line;

    public FactoryEdgeStrategies(Edge line) {
        this.line = line;

        setOnMouseEntered();
        setOnMouseExited();
        setOnMouseClicked();
        setOnMousePressed();
        setOnMouseDragged();
    }

    @Override
    public void setOnMouseEntered() {
        new OnMouseEnteredContext().mouseEntered(new EdgeEnteredStrategy(line));
    }

    @Override
    public void setOnMouseExited() {
        new OnMouseExitedContext().mouseExited(new EdgeExitedStrategy(line));
    }

    @Override
    public void setOnMouseClicked() {
        new OnMouseClickedContext().mouseClicked(new EdgeClickedStrategy(line));
    }

    @Override
    public void setOnMousePressed() { /**/ }

    @Override
    public void setOnMouseDragged() { /**/ }
}
