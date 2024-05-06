package edu.badpals.proyecto;

public class Item implements Updateable {
    private final String name;
    private int sell_in;
    private int quality;
    

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }
    

    public String getName() {
        return name;
    }

    public int getSell_in() {
        return sell_in;
    }

    public int getQuality() {
        return quality;
    }

    public void setSell_in() {
        this.sell_in = this.getSell_in()-1;
    }

    

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void update_item() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_quality'");
    }

    @Override
    public void update_sell_in() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_sell_in'");
    }
    
    
}
