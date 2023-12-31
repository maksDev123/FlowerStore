package flower.store;

import org.junit.jupiter.api.Test;

import flower.item.Flower;
import flower.item.FlowerBucket;
import flower.item.FlowerColor;
import flower.item.FlowerPack;
import flower.item.Rose;
import flower.item.Tulip;
import flower.filter.PriceFilter;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;

    @Test
    public void testPrice() {
        Item rose = new Rose(FlowerColor.BLUE, 10, 10);
        Item tulip = new Tulip(FlowerColor.RED, 11, 5);
        Item chamomile = new Rose(FlowerColor.RED, 20, 7);

        Item pack = new FlowerPack((Flower) tulip, 3);
        Item pack1 = new FlowerPack((Flower) rose, 5);

        List <FlowerPack> packs = new ArrayList <FlowerPack>();
        packs.add((FlowerPack) pack);
        packs.add((FlowerPack) pack1);

        Item buckethItems = new FlowerBucket(packs);
        
        List <Item> items = new ArrayList<Item>();
        items.add(rose);
        items.add(tulip);
        items.add(chamomile);
        items.add(pack);
        items.add(pack1);
        items.add(buckethItems);

        store = new Store(items);

        PriceFilter filter = new PriceFilter(6);

        Assertions.assertEquals(store.searchItems(filter).size(), 1);
    }

    
}
