package com.mariuspurici.texteditor;

public class Editor {
    protected String text;

    public Editor(String text) {
        this.text = text;
    }

    public String show() {
        return this.text;
    }

    public String getSelection(int i, int j) {
        return this.text.substring(i, j);
    }

    public void deleteSelection(int i, int j) {
        this.text = this.text.substring(0, i) + this.text.substring(j);
    }

    public void replaceSelection(int i, int j, String text) {
        this.text = this.text.substring(0, i) + text + this.text.substring(j);
    }
}
