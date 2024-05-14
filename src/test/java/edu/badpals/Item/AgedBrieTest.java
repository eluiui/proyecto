package edu.badpals.Item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgedBrieTest {
    @Test
    public void testSellInUpdate(){
        AgedBrie brie = new AgedBrie("AgedBrie", 10, 20);
        brie.update_item();
        assertEquals(9, brie.getSellIn());
    }
    @Test
    public void testSellInMasZero(){
        AgedBrie brie = new AgedBrie("AgedBrie", 10, 20);
        brie.update_quality();
        assertEquals(21, brie.getQuality());
    }
    @Test
    public void testSellInMenosZero(){
        AgedBrie brie = new AgedBrie("AgedBrie", -1, 20);
        brie.update_quality();
        assertEquals(22, brie.getQuality());
    }
    @Test
    public void testSellInZero(){
        AgedBrie brie = new AgedBrie("AgedBrie", 0, 20);
        brie.update_quality();
        assertEquals(22, brie.getQuality());
    }
    public void testQualityMasCincuenta(){
        AgedBrie brie = new AgedBrie("AgedBrie", 0, 50);
        brie.update_quality();
        assertEquals(50, brie.getQuality());
    }
    public void testQualityMasCincuenta1(){
        AgedBrie brie = new AgedBrie("AgedBrie", -7, 50);
        brie.update_quality();
        assertEquals(50, brie.getQuality());
    }
}
