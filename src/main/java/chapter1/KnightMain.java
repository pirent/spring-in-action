package chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter1.knights.Knight;

public class KnightMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight-wiring.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
