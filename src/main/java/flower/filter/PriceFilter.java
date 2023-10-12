package flower.filter;

import flower.store.Item;

public class PriceFilter implements SearchFilter {
    private float maxPrice;
    public PriceFilter(float maxPrice) {
        this.maxPrice = maxPrice;
    }
    @Override
    public boolean match(Item item) {
        return item.getPrice() < maxPrice;
    }
}
