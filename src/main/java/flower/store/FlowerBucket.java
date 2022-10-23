package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();
    private double price;
    FlowerBucket(){
        price = 0;
    }
    public void add(FlowerPack pack) {
        packList.add(pack);
        price += pack.getPrice();
    }
    public double getPrice(){
        return price;
    }
}
