package DAO;

import Entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class MenuService{
@Autowired
    private MenuDAO menuDAO;
public void saveMenu(Menu menu){
    if (menu.getPizzas().size() < 2) throw new RuntimeException("Il nome non può essere più corto di 2");
    menuDAO.save(menu);
}
}
