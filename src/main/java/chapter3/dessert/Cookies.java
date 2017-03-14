package chapter3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("crispy")
public class Cookies implements Dessert {

	public void beAte() {
		System.out.println("Cookies are being eaten");
	}

}
