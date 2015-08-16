package com.examples.bakery;


import com.examples.bakery.subitems.SubItem;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Pizza extends BakeryItems {
    private SubItem subItem;

    public Pizza(SubItem subItem) {
        this.subItem = subItem;
    }

    @Override
    void bake() {
        System.out.println("Pizza bakes with "+subItem.getName());
    }
}
