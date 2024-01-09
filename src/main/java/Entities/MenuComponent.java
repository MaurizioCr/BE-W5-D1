package Entities;

import java.util.List;

public interface MenuComponent {
    String getNome();
    double getCosto();
    void aggiungiComponente(MenuComponent componente);
    void rimuoviComponente(MenuComponent componente);
    List<MenuComponent> getComponenti();

    void setNome(String hawaiianPizza);
}
