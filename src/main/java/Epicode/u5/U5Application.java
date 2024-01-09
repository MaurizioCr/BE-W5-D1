package Epicode.u5;

import Entities.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class U5Application implements CommandLineRunner {



	@Autowired
	private MenuComponent pizzaMargherita;
	@Autowired
	private MenuComponent toppingProsciutto;

	@Autowired
	private MenuComponent beverageCoke;

	@Override
	public void run(String... args) {


	}
}