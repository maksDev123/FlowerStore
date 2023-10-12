package flower.item;

import flower.store.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = new Flower(flower);
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
