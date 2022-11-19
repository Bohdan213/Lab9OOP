package ua.edu.ucu.apps.demo.Item.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        flowerRepository.save(new Flower(1, FlowerColor.WHITE, 50, 100, FlowerType.CHAMOMILE, "chamomile flower"));
        flowerRepository.save(new Flower(2, FlowerColor.GREEN, 20, 500, FlowerType.CACTUS, "cactus flower"));
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
