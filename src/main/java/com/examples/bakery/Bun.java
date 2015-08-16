package com.examples.bakery;

import com.examples.bakery.subitems.*;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Bun extends BakeryItems {
    private SubItem subItem;

    public Bun(SubItem subItem) {
        this.subItem = subItem;
    }

    public Bun() {
    }

    @Override
    void bake() {
        System.out.println("Bun bakes with "+subItem.getName());
    }

    public void setSubItem(SubItem subItem) {
        this.subItem = subItem;
    }
}
