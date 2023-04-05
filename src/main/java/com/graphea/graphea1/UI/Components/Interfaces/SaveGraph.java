package com.graphea.graphea1.UI.Components.Interfaces;

import com.graphea.graphea1.Files.SaveFile;

public interface SaveGraph {
    default void onSaveGraph() {
        SaveFile file = new SaveFile();
        file.createFile();
        file.saveFile();
    }
}
