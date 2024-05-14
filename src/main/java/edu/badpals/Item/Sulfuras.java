package edu.badpals.Item;

public class Sulfuras extends Item implements Updateable {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality=80);
    }

    @Override
    public int getQuality() {
        return this.quality;
    }

    @Override
    public int getSellIn() {
        return this.sellIn;
    }

    @Override
    public void update_item() {
        
    }

    @Override
    public void update_quality() {
        this.quality = 80;
        
    }
    
}
