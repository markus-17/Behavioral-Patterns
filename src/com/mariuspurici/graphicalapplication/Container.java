package com.mariuspurici.graphicalapplication;

import java.util.ArrayList;

public abstract class Container extends Component {
    public ArrayList<Component> children;

    public Container(String tooltipText) {
        super(tooltipText);
        children = new ArrayList<Component>();
    }

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }
}
