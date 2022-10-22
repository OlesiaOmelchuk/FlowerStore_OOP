package flower.store;

public class FlowerPack {
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    private Flower flower;
    private int quantity;
    public double getPrice(){
        return flower.getPrice() * quantity;
    }
}
