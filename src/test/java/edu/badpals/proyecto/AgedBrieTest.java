package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgedBrieTest {
    @Test
    public void crearAgedBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }
    
}
