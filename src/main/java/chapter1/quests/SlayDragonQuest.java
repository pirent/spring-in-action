package chapter1.quests;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream ps;

	public SlayDragonQuest(PrintStream ps) {
		super();
		this.ps = ps;
	}

	public void embark() {
		ps.println("Embarking on quest to slay the dragon");
	}

}
