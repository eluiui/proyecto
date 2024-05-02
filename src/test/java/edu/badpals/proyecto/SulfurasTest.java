package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);

        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName());

        assertEquals(0, sulfuras.getSell_in(), 0);

        assertEquals(80, sulfuras.getQuality(), 0);

    }

}
