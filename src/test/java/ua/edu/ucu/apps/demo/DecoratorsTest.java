package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.Item.ItemDecor.PaperDecorator;
import ua.edu.ucu.apps.demo.Item.ItemDecor.RibbonDecorator;
import ua.edu.ucu.apps.demo.Item.ItemDiscount;
import ua.edu.ucu.apps.demo.Item.flower.Flower;
import ua.edu.ucu.apps.demo.Item.flower.FlowerType;

public class DecoratorsTest {
    @Test
    public void testMain() {
        Item flower = new Flower(FlowerType.CACTUS);
        flower = new ItemDiscount(flower, 0.2);
        Assertions.assertEquals(80, flower.price());

        flower = new PaperDecorator(flower);
        Assertions.assertEquals(93, flower.price());

        flower = new RibbonDecorator(flower);
        Assertions.assertEquals(133, flower.price());
    }
}
