package com.mariuspurici.fileexplorer;

import java.util.ArrayList;

public class Directory extends File {
    protected ArrayList<File> children;

    public Directory(String directoryName) {
        super(directoryName);
        this.children = new ArrayList<File>();
    }

    public void addChild(File f) {
        this.children.add(f);
    }

    public ArrayList<File> getChildren() {
        return this.children;
    }
}
