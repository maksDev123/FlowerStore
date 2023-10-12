package flower.item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public List<FlowerPack> bucket;

    public FlowerBucket(List<FlowerPack> bucket) {
        this.bucket = bucket;
    }

    public FlowerBucket() {
        this.bucket = new ArrayList<FlowerPack>();
    }

    public double get_overall_price() {
        double overal_price = 0;
        for (FlowerPack f : this.bucket) {
            overal_price += f.getPrice();
        }
        return overal_price;
    }
}
