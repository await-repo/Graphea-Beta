package com.graphea.graphea1.UI.Components.Interfaces;

import com.graphea.graphea1.Files.OpenFile;

public interface OpenGraph {
    default void onOpenGraph() {
        OpenFile file = new OpenFile();
        file.readFile();
    }
}
