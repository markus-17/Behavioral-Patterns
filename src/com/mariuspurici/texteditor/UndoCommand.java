package com.mariuspurici.texteditor;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.app.undo();
        return false;
    }
}
