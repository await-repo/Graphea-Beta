package com.graphea.graphea1.Singletons.DataStructure;

import java.io.Serializable;

public class AuxiliarSingletonGraph extends AuxiliarGraph implements Serializable {
    private static final AuxiliarSingletonGraph INSTANCE = new AuxiliarSingletonGraph();

    private AuxiliarSingletonGraph() {}

    public static AuxiliarSingletonGraph getInstance() {
        return INSTANCE;
    }

}
