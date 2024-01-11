package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuDAO extends JpaRepository <MenuDAO, Long> {

    List<MenuDAO> findByPizza(String pizza);
    Optional<MenuDAO> findFirstByAgeGreaterThanEqual(double price);


}
