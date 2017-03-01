package chapter1;

import java.io.PrintStream;

public class Minstrel {

	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so braved");
	}
	
	public void singAfterQuest() {
		stream.println("Tee he he, the brave knight did embark on a quest");
	}
}
