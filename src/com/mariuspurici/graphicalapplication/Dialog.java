package com.mariuspurici.graphicalapplication;

public class Dialog extends Container {
    protected String wikiPageText;

    public Dialog(String wikiPageText, String tooltipText) {
        super(tooltipText);
        this.wikiPageText = wikiPageText;
    }

    @Override
    public void showHelp() {
        if(wikiPageText != null) {
            System.out.println("Dialog: " + wikiPageText);
        } else {
            super.showHelp();
        }
    }
}
