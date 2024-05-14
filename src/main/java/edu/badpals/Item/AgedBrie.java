package edu.badpals.Item;

public class AgedBrie extends Item implements Updateable {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
        this.sellIn = this.sellIn - 1;
    }
    
    @Override
    public void update_quality() {
        if(this.sellIn>0){
            this.quality = this.quality +1;
        }else if(this.sellIn<=0){
            this.quality = this.quality +2;
        }
        if (this.quality > 50) {
            this.quality = 50;
        }
        
    }
}
