package dev.raul.Fridge.controller;

import dev.raul.Fridge.model.Food;
import dev.raul.Fridge.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food){return foodService.save(food);}

    @DeleteMapping
    public void delete (@PathVariable Long id) {foodService.delete(id);}

}
