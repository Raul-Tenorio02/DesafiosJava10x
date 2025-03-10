package dev.raul.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // toda vez que adiciona uma nova comida, adiciona +1 ao id (id começa em 1)
    private Long id;
    private String name;
    private LocalDate expirationDate;
    private Integer quantity;

    public Food() {}

    public Food(String name, Long id, LocalDate expirationDate, Integer quantity) {
        this.name = name;
        this.id = id;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
