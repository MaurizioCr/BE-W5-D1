package Entities;

    import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    import java.util.Arrays;
    import java.util.Collections;

@Configuration
public class MenuConfig {
    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setPrice(8.99);
        pizza.setToppings(Collections.singletonList(new Topping("Mozzarella")));
        return pizza;
    }


        @Bean
        public Topping prosciutto() {
            return new Topping("Prosciutto");
        }

        @Bean
        public Topping ananas() {
            return new Topping("Ananas");
        }

        @Bean
        public Pizza hawaiianPizza() {
            Pizza pizza = new Pizza();
            pizza.setName("Hawaiian Pizza");
            pizza.setPrice(11.99);
            pizza.setToppings(Arrays.asList(prosciutto(), ananas()));
            return pizza;
        }

        @Bean
        public Beverage coke() {
            Beverage beverage = new Beverage();
            beverage.setName("Coke");
            beverage.setPrice(2.50);
            return beverage;
        }

        @Bean
        public Menu menu() {
            Menu menu = new Menu();
            menu.setPizzas(Arrays.asList(margherita(), hawaiianPizza()));
            menu.setDrinks(Collections.singletonList(coke()));
            return menu;
        }
    }


