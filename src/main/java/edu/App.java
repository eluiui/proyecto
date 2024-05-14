package edu;

import edu.badpals.GildedRose.GildedRose;
import edu.badpals.Item.AgedBrie;
import edu.badpals.Item.BackstagePass;
import edu.badpals.Item.ConjuredItem;
import edu.badpals.Item.NormalItem;
import edu.badpals.Item.Sulfuras;

public class App {
    public static void main(String[] args) {
        // todo shop variable name to a better one
        GildedRose shop = new GildedRose();

        ConjuredItem conjuredItem = new ConjuredItem("ConjuredItem", 10, 40);
        BackstagePass backstagePass = new BackstagePass("BackstagePass", 15, 10);
        NormalItem normalItem = new NormalItem("NormalItem", 4, 10);
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 0, 20);
        AgedBrie agedBrie = new AgedBrie("AgedBrie", 10, 10);

        shop.addItem(conjuredItem);
        shop.addItem(backstagePass);
        shop.addItem(normalItem);
        shop.addItem(sulfuras);
        shop.addItem(agedBrie);
        System.out.println("------ ITEMS ANTES DE ACTUALIZAR ------\n");
        System.out.println(shop.toString());

        for (int i = 0; i <= 31; i++) {

            System.out.println("------ DIA " + i + " ------");
            System.out.println(shop.toString());
            shop.updateItems();

        }

    }
}
