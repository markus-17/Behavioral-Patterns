package com.mariuspurici.texteditor;

public class Application {
    protected String clipboard;
    protected Editor editor;
    protected CommandHistory history;

    public Application(Editor editor) {
        this.clipboard = "";
        this.editor = editor;
        this.history = new CommandHistory();
    }

    public void pressCopyButton(int i, int j) {
        System.out.println("Copying Text from " + i + " to " + j + " using the button.");
        Command c = new CopyCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void executeCopyShortcut(int i, int j) {
        System.out.println("Copying Text from " + i + " to " + j + " using the shortcut.");
        Command c = new CopyCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void pressCutButton(int i, int j) {
        System.out.println("Cutting Text from " + i + " to " + j + " using the button.");
        Command c = new CutCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void executeCutShortcut(int i, int j) {
        System.out.println("Cutting Text from " + i + " to " + j + " using the Shortcut.");
        Command c = new CutCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void pressPasteButton(int i, int j) {
        System.out.println("Pasting Text from " + i + " to " + j + " using the Button.");
        Command c = new PasteCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void executePasteShortcut(int i, int j) {
        System.out.println("Pasting Text from " + i + " to " + j + " using the Shortcut.");
        Command c = new PasteCommand(this, this.editor);
        c.setSelection(i, j);
        this.executeCommand(c);
    }

    public void pressUndoButton() {
        System.out.println("Undoing things using the Button.");
        Command c = new UndoCommand(this, this.editor);
        this.executeCommand(c);
    }

    public void executeUndoShortcut() {
        System.out.println("Undoing things using the Shortcut.");
        Command c = new UndoCommand(this, this.editor);
        this.executeCommand(c);
    }

    void executeCommand(Command c) {
        if(c.execute()) {
            this.history.push(c);
        }
    }

    public void undo() {
        Command c = history.pop();
        c.undo();
    }

    public void display() {
        System.out.println("---> Text Inside Editor: \u001B[32m" + this.editor.show() + "\u001B[0m");
    }
}
