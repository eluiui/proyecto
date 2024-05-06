package edu.badpals.proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.management.AttributeList;

/**
 * Hello world!
 *
 */
public class GildedRose {
    List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> itemsArray() {
        return this.items;
    }


    public void updateQuality() {
        
        for (Item item : itemsArray()) {
            if (item.getSell_in() > 0) {
                int value=-1;
                if (item.getQuality() + value > 50) {
                    item.setQuality(50);
                } else if (item.getQuality() + value >= 0) {
                    item.setQuality(item.getQuality() + value);
                } else {
                    item.setQuality(0);
                }
            } else {
                int value=-2;
                if (item.getQuality() + value > 50) {
                    item.setQuality(50);
                } else if (item.getQuality() + value >= 0) {
                    item.setQuality(item.getQuality() + value);
                } else {
                    item.setQuality(0);
                }
            }
            item.setSell_in();
        }
    }

    public static void main(String[] args) {

    }

}
