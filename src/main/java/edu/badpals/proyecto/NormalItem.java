package edu.badpals.proyecto;

public class NormalItem extends Item implements Updateable{

    public NormalItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
        //TODO Auto-generated constructor stub
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
