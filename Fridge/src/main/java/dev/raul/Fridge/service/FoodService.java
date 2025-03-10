package dev.raul.Fridge.service;

import org.springframework.stereotype.Service;
import dev.raul.Fridge.model.Food;
import dev.raul.Fridge.repository.FoodRepository;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //READ
    public List<Food> getAll() {return foodRepository.findAll();}
    //CREATE
    public Food save(Food food){return foodRepository.save(food);}
    //DELETE
    public void delete(Long id) {foodRepository.deleteById(id);}


}
