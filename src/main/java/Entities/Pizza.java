package Entities;

import lombok.Getter;

import java.util.List;

public class Pizza implements MenuComponent {

        private String name;
        private double price;
        private List<Topping> toppings;


    public Pizza(String name, double price, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public double getCosto() {
        double costoToppings = toppings.stream().mapToDouble(MenuComponent::getCosto).sum();
        return baseCosto + costoToppings;
    }
}
