package com.mariuspurici.graphicalapplication;

public abstract class Component implements ComponentWithContextualHelp{
    protected String tooltipText;
    protected Container container;

    public Component(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    @Override
    public void showHelp() {
        if(tooltipText != null) {
            System.out.println("Component: " + tooltipText);
        } else {
            container.showHelp();
        }
    }
}
