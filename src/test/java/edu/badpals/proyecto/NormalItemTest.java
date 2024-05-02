package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalItemTest {
   @Test
    public void crearNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(10, normal.getSell_in(), 0);
        assertEquals(20, normal.getQuality(), 0);
    }
 
}
