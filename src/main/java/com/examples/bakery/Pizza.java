package com.examples.bakery;


import com.examples.bakery.subitems.SubItem;

import java.util.Map;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Pizza extends BakeryItems {
    private SubItem subItem;

    private Map<Size,Integer> prices;

    public Pizza(SubItem subItem) {
        this.subItem = subItem;
    }

    @Override
    void bake() {
        System.out.println("Pizza bakes with "+subItem.getName());
        System.out.println("Available prices are "+prices.toString());
    }

    public void setPrices(Map<Size, Integer> prices) {
        this.prices = prices;
    }
}
