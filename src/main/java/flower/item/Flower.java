package flower.item;

import flower.store.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @Getter @ NoArgsConstructor
public class Flower extends Item {

    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;



    public Flower(Flower flowerCopy) {
        this.color = flowerCopy.color;
        this.flowerType = flowerCopy.flowerType;
        this.sepalLength = flowerCopy.sepalLength;
        this.price = flowerCopy.price;
    }


    public Flower(FlowerColor color, FlowerType flowerType, double sepalLength, double price) {
        this.color = color;
        this.flowerType = flowerType;
        this.sepalLength = sepalLength;
        this.price = price;
    }
    public String getColor() {
        return color.toString();
    }
}
