package edu.badpals.Item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class BackstagePassTest {
    @Test
    public void testSellInUpdate(){
        BackstagePass pass = new BackstagePass("BackstagePass", 10, 20);
        pass.update_item();
        assertEquals(9, pass.getSellIn());
    }
    @Test
    public void testSellInMasTen(){
        BackstagePass pass = new BackstagePass("BackstagePass", 11, 20);
        pass.update_quality();
        assertEquals(21, pass.getQuality());
    }
    @Test
    public void testSellInTen(){
        BackstagePass pass = new BackstagePass("BackstagePass", 10, 20);
        pass.update_quality();
        assertEquals(22, pass.getQuality());
    }
    @Test
    public void testSellInMenorTenMasFive(){
        BackstagePass pass = new BackstagePass("BackstagePass", 9, 20);
        pass.update_quality();
        assertEquals(22, pass.getQuality());
    }
    @Test
    public void testSellInFive(){
        BackstagePass pass = new BackstagePass("BackstagePass", 5, 20);
        pass.update_quality();
        assertEquals(23, pass.getQuality());
    }
    public void testSellInMenorFiveMasZero(){
        BackstagePass pass = new BackstagePass("BackstagePass", 3, 20);
        pass.update_quality();
        assertEquals(23, pass.getQuality());
    }
    public void testSellInZero(){
        BackstagePass pass = new BackstagePass("BackstagePass", 0, 20);
        pass.update_quality();
        assertEquals(23, pass.getQuality());
    }
    public void testSellInMenorZero(){
        BackstagePass pass = new BackstagePass("BackstagePass", -1, 20);
        pass.update_quality();
        assertEquals(0, pass.getQuality());
    }
    public void testQualityMasCincuenta(){
        BackstagePass pass = new BackstagePass("BackstagePass", 30, 50);
        pass.update_quality();
        assertEquals(50, pass.getQuality());
    }
    public void testQualityMasCincuenta1(){
        BackstagePass pass = new BackstagePass("BackstagePass", 7, 50);
        pass.update_quality();
        assertEquals(50, pass.getQuality());
    }
    public void testQualityMasCincuenta2(){
        BackstagePass pass = new BackstagePass("BackstagePass", 3, 50);
        pass.update_quality();
        assertEquals(50, pass.getQuality());
    }
}
