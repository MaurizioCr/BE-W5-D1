package Entities;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

public class Tavolo {
        @Getter
        @Setter
        private int numero;
        private int copertiMassimi;
        private StatoTavolo stato;

    public Tavolo(int numero, int copertiMassimi, StatoTavolo stato) {
        this.numero = numero;
        this.copertiMassimi = copertiMassimi;
        this.stato = stato;
    }
}

