package com.mariuspurici.texteditor;

import java.util.ArrayList;

public class CommandHistory {
    private final ArrayList<Command> history;

    public CommandHistory() {
        this.history = new ArrayList<Command>();
    }

    public void push(Command c) {
        this.history.add(c);
    }

    public Command pop() {
        return this.history.remove(this.history.size() - 1);
    }
}
