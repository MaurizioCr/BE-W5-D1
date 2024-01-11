package Entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Menu {
    private List<Pizza> pizzas;
    private List<Beverage> drinks;

    public Menu(List<Pizza> pizzas, List<Beverage> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    public Menu() {

    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Beverage> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Beverage> drinks) {
        this.drinks = drinks;
    }
}
