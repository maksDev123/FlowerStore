package flower.item;

import java.util.ArrayList;
import java.util.List;

import flower.store.Item;

public class FlowerBucket extends Item{
    private List<FlowerPack> bucket;

    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }

    public FlowerBucket() {
        this.bucket = new ArrayList<FlowerPack>();
    }

    public double getPrice() {
        double overal_price = 0;
        for (FlowerPack f : this.bucket) {
            overal_price += f.getPrice();
        }
        return overal_price;
    }
}
