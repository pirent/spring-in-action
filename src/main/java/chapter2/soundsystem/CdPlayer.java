package chapter2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class CdPlayer implements MediaPlayer {
	private CompactDisc compactDisc;

	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.compactDisc = cd;
	}

	public void play() {
		compactDisc.play();
	}

}
