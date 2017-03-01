package chapter1.knights;

import chapter1.quests.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
