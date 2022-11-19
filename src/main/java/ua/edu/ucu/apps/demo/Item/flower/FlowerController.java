package ua.edu.ucu.apps.demo.Item.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="api/v1/flower")
@RestController
public class FlowerController {
    public FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {this.flowerService = flowerService;}
    @GetMapping
    public List<Flower> hello() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
