package com.examples.bakery;

import com.examples.bakery.subitems.SubItem;

import java.util.List;

/**
 * Created by ka40215 on 8/16/15.
 */
public class CheeseCake extends BakeryItems implements SubItem {
    private List<SubItem> subItems;

    public CheeseCake(List<SubItem> subItems) {
        this.subItems = subItems;
    }

    public CheeseCake() {
    }

    public String getName() {
        return "Cheese Cake";
    }

    @Override
    void bake() {
        String name = "";
        for (SubItem si : subItems) {
            name += ", "+si.getName();
        }
        System.out.println("Cheese Cake bakes with" + name);
    }

    public void setSubItems(List<SubItem> subItems) {
        this.subItems = subItems;
    }
}
