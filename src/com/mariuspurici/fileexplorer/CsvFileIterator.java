package com.mariuspurici.fileexplorer;

import java.util.ArrayList;

public class CsvFileIterator extends FileIterator {
    public CsvFileIterator(File f) {
        super(f);
        ArrayList<String> newFileNames = new ArrayList<String>();
        for(String s : fileNames) {
            if(s.endsWith(".csv")) {
                newFileNames.add(s);
            }
        }
        this.fileNames = newFileNames;
        this.length = fileNames.size();
    }
}
