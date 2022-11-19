package ua.edu.ucu.apps.demo.Item.ItemDecor;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.demo.Item.Item;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator{
    private Item item;
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with basket decorator";
    }
}
