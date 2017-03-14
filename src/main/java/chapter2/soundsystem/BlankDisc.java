package chapter2.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(String title, String artist, List<String> tracks) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

	public void playTrack(int trackNumber) {
		String trackName = tracks.get(trackNumber);
		System.out.println("Playing track \"" + trackName + "\"");
	}

}
