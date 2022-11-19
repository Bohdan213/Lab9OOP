package ua.edu.ucu.apps.demo;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Item> items = new ArrayList<>();
    @Setter @Getter
    public Payment payment;
    @Setter @Getter
    public Delivery delivery;

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        return ;
    }
}
