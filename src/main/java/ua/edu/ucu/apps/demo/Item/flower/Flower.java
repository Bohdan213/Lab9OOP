package ua.edu.ucu.apps.demo.Item.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue
    private int id;
    private FlowerColor color;
    private double sepalLenght;
    private double price;
    private FlowerType flowerType;
    private String description;


//    public Flower(FlowerType flowerType) {
//        switch (flowerType) {
//            case CACTUS -> {
//                this.flowerType = flowerType;
//                this.color = FlowerColor.GREEN;
//                this.sepalLenght = 50;
//                this.price = 100;
//                this.description = "cactus flower";
//            }
//            case CHAMOMILE -> {
//                this.flowerType = flowerType;
//                this.color = FlowerColor.WHITE;
//                this.sepalLenght = 30;
//                this.price = 20;
//                this.description = "chamomile flower";
//            }
//        }
//    }

    @Override
    public String toString() {
        return "price: " + getPrice() + " color " + getColor();
    }

    @Override
    public double price() {
        return this.price;
    }
}
