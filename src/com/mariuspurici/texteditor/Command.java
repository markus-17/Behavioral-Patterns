package com.mariuspurici.texteditor;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    protected int i, j;

    public void setSelection(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
        this.backup = "";
    }

    public void saveBackup() {
        this.backup = editor.text;
    }

    public void undo() {
        editor.text = this.backup;
    }

    public abstract boolean execute();
}
