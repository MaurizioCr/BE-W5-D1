package Epicode.u5;

import Entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

@SpringBootApplication
public class U5Application {

	public static void main(String[] args) {
		SpringApplication.run(U5Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

		Menu menu = context.getBean(Menu.class);

		System.out.println("Menu:");
		System.out.println("Pizzas:");
		for (Pizza pizza : menu.getPizzas()) {
			System.out.println(pizza.getName() + " - $" + pizza.getPrice());
			System.out.println("Toppings: " + pizza.getToppings().stream().map(Topping::getName).collect(Collectors.joining(", ")));
		}

		System.out.println("\nDrinks:");
		for (Beverage drink : menu.getDrinks()) {
			System.out.println(drink.getName() + " - $" + drink.getPrice());
		}
	}
}


