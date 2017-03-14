package chapter3.dessert;

import org.springframework.stereotype.Component;

import chapter3.dessert.annotation.Cold;
import chapter3.dessert.annotation.Fruity;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

	public void beAte() {
		System.out.println("A popsicle is being consumed");
	}

}
