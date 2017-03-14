package chapter3.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import chapter3.dessert.annotation.Cold;
import chapter3.dessert.annotation.Creamy;

@Component
//@Primary
@Cold
@Creamy
public class IceCream implements Dessert {

	public void beAte() {
		System.out.println("Ice cream is melting in mouth");
	}

}
