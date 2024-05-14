package edu.badpals.Item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SulfurasTest {
    @Test
    public void testSellInUpdate(){
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.update_item();
        sulfuras.update_quality();
        assertEquals(0,sulfuras.getSellIn()) ;
        assertEquals(80, sulfuras.getQuality());
    }
    @Test
    public void testSellInQuality(){
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 2, 80);
        sulfuras.update_quality();
        assertEquals(2,sulfuras.getSellIn()) ;
        assertEquals(80, sulfuras.getQuality());
    }
    @Test
    public void testSellInQuality1(){
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 1, 80);
        sulfuras.update_quality();
        sulfuras.update_item();
        assertEquals(1,sulfuras.getSellIn()) ;
        assertEquals(80, sulfuras.getQuality());
    }
}
