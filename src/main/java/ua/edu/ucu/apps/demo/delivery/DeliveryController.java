package ua.edu.ucu.apps.demo.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RequestMapping(path="api/v1/Delivery")
@RestController
public class DeliveryController {
    @GetMapping
    public String start() {
        ArrayList<Delivery> list = new ArrayList<>();
        Delivery postDelivery = new PostDeliveryStrategy();
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        list.add(postDelivery);
        list.add(dhlDelivery);
        return list.toString();
    }

}
