package ua.edu.ucu.apps.demo.Item;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.Item.ItemDecor.BasketDecorator;
import ua.edu.ucu.apps.demo.Item.ItemDecor.PaperDecorator;
import ua.edu.ucu.apps.demo.Item.ItemDecor.RibbonDecorator;
import ua.edu.ucu.apps.demo.Item.flower.Flower;
import ua.edu.ucu.apps.demo.Item.flower.FlowerColor;
import ua.edu.ucu.apps.demo.Item.flower.FlowerType;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private ItemRepository itemRepository;
    public List<Item> findAll() {
        Item flower1 = new Flower(1, FlowerColor.WHITE, 50, 100, FlowerType.CHAMOMILE, "chamomile flower");
        Item flower2 = new Flower(1, FlowerColor.GREEN, 20, 500, FlowerType.CACTUS, "cactus flower");
        List<Item> ls = new ArrayList<>();
        ls.add(new BasketDecorator(flower1));
        ls.add(new PaperDecorator(new RibbonDecorator(flower2)));
        return ls;
    }
}
