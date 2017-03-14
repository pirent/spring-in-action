package chapter3.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import chapter3.dessert.annotation.Cold;
import chapter3.dessert.annotation.Creamy;

@Component
public class Consumer {

	private Dessert dessert;

	@Autowired
	@Cold
	@Creamy
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public void havingDessert() {
		dessert.beAte();
	}
}
