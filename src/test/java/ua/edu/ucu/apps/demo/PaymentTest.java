package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payments.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.ArrayList;

public class PaymentTest {

    @Test
    public void testPrice() {
        ArrayList<Payment> list = new ArrayList<>();
        Payment paypal = new PayPalPaymentStrategy();
        Payment creditCard = new CreditCardPaymentStrategy();
        list.add(paypal);
        list.add(creditCard);

        Assertions.assertEquals(list.size(), 2);

    }
}