package flower.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    private FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = new Flower(flower);
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
