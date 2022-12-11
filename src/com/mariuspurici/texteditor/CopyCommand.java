package com.mariuspurici.texteditor;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.app.clipboard = this.editor.getSelection(this.i, this.j);
        return false;
    }
}
