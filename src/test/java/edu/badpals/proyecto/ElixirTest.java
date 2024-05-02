package edu.badpals.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElixirTest {
    @Test
    public void crearElixir() {

        Elixir elixir = new Elixir("Elixir of the Mongoose", 7, 5);
        assertEquals("Elixir of the Mongoose", elixir.getName());
        assertEquals(5, elixir.getSell_in(), 0);
        assertEquals(7, elixir.getQuality(), 0);
    }
}
