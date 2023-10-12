package flower.filter;

import flower.store.Item;

public class PriceFilter implements SearchFilter {
    public float max_price;
    public PriceFilter(float max_price){
        this.max_price = max_price;
    }
    @Override
    public boolean match(Item item) {
        return item.getPrice() < max_price;
    }
}
