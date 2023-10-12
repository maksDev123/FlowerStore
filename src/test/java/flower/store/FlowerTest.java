package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flower.item.Chamomile;
import flower.item.Flower;
import flower.item.FlowerBucket;
import flower.item.FlowerColor;
import flower.item.FlowerPack;
import flower.item.FlowerType;
import flower.item.Rose;
import flower.item.Tulip;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testRose() {
        Rose rose = new Rose(FlowerColor.BLUE, 10, 10);
        Assertions.assertEquals(rose.getFlowerType(), FlowerType.ROSE);

    }

    @Test
    public void testTulip() {
        Tulip tulip = new Tulip(FlowerColor.BLUE, 10, 10);
        Assertions.assertEquals(tulip.getFlowerType(), FlowerType.TULIP);
    }

    @Test
    public void testChamomile() {
        Chamomile chamomile = new Chamomile(FlowerColor.BLUE, 10, 10);
        Assertions.assertEquals(chamomile.getFlowerType(), FlowerType.CHAMOMILE);
    }
 @Test
    public void testFlowerPacksAndBucket() {
    Item rose = new Rose(FlowerColor.BLUE, 10, 10);
    Item tulip = new Tulip(FlowerColor.RED, 11, 5);

    Item pack = new FlowerPack((Flower)rose, 3);
    Item pack1 = new FlowerPack((Flower)tulip, 5);

    Assertions.assertEquals(pack.getPrice(), 30);
    Assertions.assertEquals(pack1.getPrice(), 25);

    List <FlowerPack> packs = new ArrayList<FlowerPack>();
        packs.add((FlowerPack)pack);
        packs.add((FlowerPack)pack1);

    FlowerBucket buckethItems = new FlowerBucket(packs);
    
    Assertions.assertEquals(buckethItems.getPrice(), 55);

}
   
}
