package flower.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter @Getter @ NoArgsConstructor
public class Flower {

    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;



    public Flower(Flower flower_copy){
        this.color = flower_copy.color;
        this.flowerType = flower_copy.flowerType;
        this.sepalLength = flower_copy.sepalLength;
        this.price = flower_copy.price;
    }


    public Flower(FlowerColor color, FlowerType flowerType, double sepalLength, double price){
        this.color = color;
        this.flowerType = flowerType;
        this.sepalLength = sepalLength;
        this.price = price;
    }
    public String getColor() {
        return color.toString();
    }
}
