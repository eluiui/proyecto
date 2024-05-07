package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackStageTest {
        @Test
    public void crearBackstage() {

        BackStagePass pass = new BackStagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", pass.getName());
        assertEquals(15, pass.getSell_in(), 0);
        assertEquals(20, pass.getQuality(), 0);
    }
}
