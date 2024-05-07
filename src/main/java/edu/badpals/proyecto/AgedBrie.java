package edu.badpals.proyecto;
public class AgedBrie extends Item implements Updateable{

    private final Item item;

    public AgedBrie(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
        this.item= new Item(name, sell_in, quality);
    }

    @Override
    public void update_item() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        if(getSell_in()>0){
            item.setQuality(getQuality()+1);
        }else {
            item.setQuality(getQuality()+2);
        }
        setSell_in();
    }

    @Override
    public void update_sell_in() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_sell_in'");
    }
}
