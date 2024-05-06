package edu.badpals.proyecto;
public class Elixir extends NormalItem {

    public Elixir(String name, int quality, int sell_in) {
        super(name,sell_in,quality);
    }

    Elixir elixir;

    @Override
    public void update_item() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        GildedRose gildedRose= new GildedRose();
        gildedRose.updateQuality();
    }

    @Override
    public void update_sell_in() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_sell_in'");
    }
}
