package Entities;

import lombok.Getter;
import lombok.Setter;

public class Topping implements MenuComponent{
    @Getter
    @Setter
        private String name;
        private double costo;


    public Topping(String name, double costo) {
        this.name = name;
        this.costo = costo;
    }

    @Override
    public double getCosto() {
        return costo;
    }
}
