package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Item.flower.FlowerColor;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.Item.flower.Flower;
import ua.edu.ucu.apps.demo.Item.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.Item.flower.FlowerType;
import ua.edu.ucu.apps.demo.payments.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payments.Payment;

public class OrderTest {

    @Test
    public void test() {
        Flower flower1 = new Flower(1, FlowerColor.GREEN, 100, 300, FlowerType.CHAMOMILE, "chamomile flower");
        Flower flower2 = new Flower(2, FlowerColor.WHITE, 50, 200, FlowerType.CACTUS, "cactus flower");
        FlowerBucket bucket = new FlowerBucket("Bucket");
        bucket.add(flower1);
        bucket.add(flower2);
        Flower flower3 = new Flower(2, FlowerColor.WHITE, 40, 100, FlowerType.CACTUS, "cactus flower");
        Payment payment = new PayPalPaymentStrategy();
        Delivery delivery = new PostDeliveryStrategy();
        Order order = new Order();
        order.setDelivery(delivery);
        order.setPayment(payment);
        order.addItem(bucket);
        order.addItem(flower3);
        Assertions.assertEquals(delivery, order.getDelivery());
        Assertions.assertEquals(payment, order.getPayment());
        Assertions.assertEquals(order.calculateTotalPrice(), 600);
    }
}