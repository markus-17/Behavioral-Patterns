package com.mariuspurici.texteditor;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.saveBackup();
        this.app.clipboard = this.editor.getSelection(this.i, this.j);
        this.editor.deleteSelection(this.i, this.j);
        return true;
    }
}
