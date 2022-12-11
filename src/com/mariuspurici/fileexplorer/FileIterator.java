package com.mariuspurici.fileexplorer;

import java.util.ArrayList;

public class FileIterator implements Iterator {
    protected ArrayList<String> fileNames;
    protected int index;
    protected int length;
    private File file;

    public FileIterator(File f) {
        this.file = f;
        this.fileNames = new ArrayList<String>();
        FileIterator.setFileNames(this.fileNames, this.file);
        this.index = -1;
        this.length = fileNames.size();
    }

    private static void setFileNames(ArrayList<String> fileNames, File f) {
        if(f instanceof Directory) {
            for(File child : ((Directory) f).getChildren()) {
                FileIterator.setFileNames(fileNames, child);
            }
            fileNames.add(f.getName());
        } else {
            fileNames.add(f.getName());
        }
    }

    @Override
    public String next() {
        this.index += 1;
        return this.fileNames.get(this.index);
    }

    @Override
    public boolean isDone() {
        return this.index + 1 == this.length;
    }
}
