package Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    @Getter
    @Setter

    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<ElementoOrdine> elementiOrdine;

    public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti, LocalDateTime oraAcquisizione, List<ElementoOrdine> elementiOrdine) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.elementiOrdine = elementiOrdine;
    }
}
