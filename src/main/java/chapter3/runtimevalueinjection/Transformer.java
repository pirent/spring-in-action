package chapter3.runtimevalueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Transformer {

	private String name;
	private String clan;

	public Transformer(@Value("${transformer.name}") String name, @Value("${transformer.clan}") String clan) {
		this.name = name;
		this.clan = clan;
	}

	public void rollOut() {
		System.out.println(clan + " - " + name + " is rolling out.");
	}
}
