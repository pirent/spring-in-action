package chapter1.knights;

import chapter1.quests.Quest;

public class BraveKnight implements Knight {

	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
