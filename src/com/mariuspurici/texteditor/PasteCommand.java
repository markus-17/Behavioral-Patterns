package com.mariuspurici.texteditor;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.saveBackup();
        this.editor.replaceSelection(this.i, this.j, this.app.clipboard);
        return true;
    }
}
