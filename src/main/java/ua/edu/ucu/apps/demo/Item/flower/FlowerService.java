package ua.edu.ucu.apps.demo.Item.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        Flower flower1 = new Flower();
        flower1.setId(1);
        flower1.setFlowerType(FlowerType.CHAMOMILE);
        flower1.setColor(FlowerColor.WHITE);
        flower1.setDescription("chamomile flower");
        flower1.setPrice(300);
        flower1.setSepalLenght(100);
        flowerRepository.save(flower1);
        Flower flower2 = new Flower();
        flower2.setId(2);
        flower2.setFlowerType(FlowerType.CACTUS);
        flower2.setColor(FlowerColor.GREEN);
        flower2.setDescription("cactus flower");
        flower2.setPrice(1000);
        flower2.setSepalLenght(50);
        flowerRepository.save(flower2);
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
