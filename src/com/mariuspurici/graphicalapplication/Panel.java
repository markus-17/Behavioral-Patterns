package com.mariuspurici.graphicalapplication;

public class Panel extends Container {
    protected String modalHelpText;

    public Panel(String modalHelpText, String tooltipText) {
        super(tooltipText);
        this.modalHelpText = modalHelpText;
    }

    public void showHelp() {
        if(this.modalHelpText != null) {
            System.out.println("Panel: " + this.modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
