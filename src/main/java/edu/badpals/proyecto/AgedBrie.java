package edu.badpals.proyecto;
public class AgedBrie extends Item implements Updateable{

    public AgedBrie(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
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
