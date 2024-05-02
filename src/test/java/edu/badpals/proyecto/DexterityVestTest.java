package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DexterityVestTest {
    @Test
    public void crearDexterityVest() {

        DexterityVest decterityvest = new DexterityVest("Dexterity Vest", 20, 10);
        assertEquals("Dexterity Vest", decterityvest.getName());
        assertEquals(10, decterityvest.getSell_in(), 0);
        assertEquals(20, decterityvest.getQuality(), 0);
    }
}
