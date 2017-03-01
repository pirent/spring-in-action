package chapter1.quests;

public class RescueDamselQuest implements Quest {

	public void embark() {
		System.out.println("embark on " + this.getClass().getSimpleName());
	}

}
