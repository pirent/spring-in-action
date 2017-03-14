package chapter3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("soft")
public class Cake implements Dessert {

	public void beAte() {
		System.out.println("A cake is being eaten");
	}

}
