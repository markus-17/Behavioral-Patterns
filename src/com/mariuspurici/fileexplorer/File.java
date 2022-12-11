package com.mariuspurici.fileexplorer;

public class File {
    protected String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return fileName;
    }
}
