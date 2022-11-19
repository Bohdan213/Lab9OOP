package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowers.Item.flower.Flower;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerType;

import java.util.Random;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(FlowerType.CHAMOMILE);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Assertions.assertEquals(20, flower.getPrice());
    }

    @Test
    public void testColor() {
        Assertions.assertEquals("#FFFFFF", flower.getColor().toString());
    }
}
