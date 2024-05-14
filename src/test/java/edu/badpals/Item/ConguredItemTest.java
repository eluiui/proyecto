package edu.badpals.Item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ConguredItemTest {
    @Test
    public void testSellInUpdate(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 10, 20);
        conjured.update_item();
        assertEquals(9, conjured.getSellIn());
    }
    @Test
    public void testSellInMasZero(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 10, 20);
        conjured.update_quality();
        assertEquals(18, conjured.getQuality());
    }
    @Test
    public void testSellInZero(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 0, 20);
        conjured.update_quality();
        assertEquals(18, conjured.getQuality());
    }
    @Test
    public void testSellInMenosZero(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 20);
        conjured.update_quality();
        assertEquals(16, conjured.getQuality());
    }
    @Test
    public void testQualityUpdateUnderZero(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 6);
        conjured.update_quality();
        assertEquals(2,conjured.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero3(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 3);
        conjured.update_quality();
        assertEquals(0,conjured.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero2(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 2);
        conjured.update_quality();
        assertEquals(0,conjured.getQuality()) ;
    }

    @Test
    public void testQualityUpdateUnderZero1(){
        ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 1);
        conjured.update_quality();
        assertEquals(0,conjured.getQuality()) ;
    }
}
