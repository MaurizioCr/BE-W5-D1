package Entities;

import lombok.Getter;
import lombok.Setter;

public class ElementoOrdine {
    @Getter
    @Setter
    private MenuConfig elemento;
    private int quantita;

    public ElementoOrdine(MenuConfig elemento, int quantita) {
        this.elemento = elemento;
        this.quantita = quantita;
    }
}
