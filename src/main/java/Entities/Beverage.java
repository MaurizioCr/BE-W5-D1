package Entities;

import lombok.Getter;
import lombok.Setter;

public class Beverage implements MenuComponent {
    @Getter
    @Setter

    private String name;
    public double price;
    private double costo;

    public Beverage(String name, double price, double costo) {
        this.name = name;
        this.price = price;
        this.costo = costo;
    }

    @Override
    public double getCosto() {
        return costo;
    }


}
