package com.graphea.graphea1.dataEstructures.graphs.DirectedGraph;

import com.graphea.graphea1.Observer.Observer;
import com.graphea.graphea1.Singletons.Providers.SingletonProvider;
import com.graphea.graphea1.Functional.Message;
import com.graphea.graphea1.Interfaces.InterfaceAdd;
import com.graphea.graphea1.Interfaces.InterfaceRemove;
import javafx.scene.shape.Circle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Graph extends Circle implements Serializable, InterfaceAdd, InterfaceRemove {

    private List<Vertex> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private Hashtable<Vertex, List<Vertex>> adjacencyList = new Hashtable<>();
    private Hashtable<Vertex,Hashtable<Vertex,Integer>> adjacencyMatrix = new Hashtable<>();


    public void insertVertex(Vertex node){
        nodes.add(node);
    }

    public void insertEdge (Vertex origin, Vertex destination) {
        edges.add(new Edge(origin,destination));
    }

    public void insertEdge (Edge edge) {
        edges.add(edge);
    }

    public void deleteVertex (Vertex node) {
        nodes.removeIf(aux -> aux == node);
        edges.removeIf(edge -> edge.getStart()== node || edge.getEnd() == node);
        remove(node);
    }

    public void deleteEdge (Vertex origin, Vertex destination) {
        edges.removeIf(edge -> edge.getStart() == origin && edge.getEnd() == destination);
    }

    public void deleteEdge (Edge temp) {
        edges.removeIf(edge -> edge == temp);
    }


    boolean isEmpty() {
        return nodes.isEmpty();
    }

    void createMatrix () {
        Hashtable<Vertex,Integer> row = new Hashtable<>();

        nodes.forEach(j -> row.put(j,0));
        nodes.forEach(i -> adjacencyMatrix.put(i,new Hashtable<>(row)));
    }

    void matrixAdjacent () {
        createMatrix();
        edges.stream().filter( edge -> adjacencyMatrix.get(edge.getStart()).containsKey(edge.getEnd()) )
                .forEach( edge -> adjacencyMatrix.get(edge.getStart()).put(edge.getEnd(), 1) );
    }

    void listAdjacent () {
        edges.forEach(edge -> adding(edge.getStart(), edge.getEnd()));

        edges.stream().filter(e -> !adjacencyList.containsKey(e.getEnd())).
                forEach(e -> adjacencyList.put(e.getEnd(), new ArrayList<>()));
    }

    void adding (Vertex a, Vertex b) {
        if (adjacencyList.containsKey(a))
            adjacencyList.get(a).add(b);
        else
            adjacencyList.put( a, new ArrayList<>() {{ add(b); }} );
    }

    void printAdjacencyList (){
        adjacencyList.forEach((k,v) -> System.out.println( k + " -> " +v.toString()));
    }

    void printAdjacencyMatrix (){
        adjacencyMatrix.forEach((k,v) -> System.out.println( k + " -> " +v.toString()));
    }

    public void printList (){
        adjacencyList.forEach((k,v) -> {
            System.out.print(k + " -> ");
            v.forEach(node -> System.out.print(node + "  "));
            System.out.println();
        });
    }

    public void printMatrix(){
        adjacencyMatrix.forEach((k,v) -> {
            v.forEach((i,j) -> System.out.print(j + "  "));
            System.out.println();
        });
    }


    public List<Vertex> getNodes() {
        return nodes;
    }

    public void setNodes(List<Vertex> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Graph {\n nodes = " + nodes + "\n\n edges = " + edges + "\n} ";
    }
}
