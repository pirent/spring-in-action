package chapter4.soundsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chapter2.soundsystem.BlankDisc;
import chapter2.soundsystem.CompactDisc;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		List<String> tracks = new ArrayList<String>();
		Collections.addAll(tracks, "Love Me Again", "Clumsy", "Fountain");
		BlankDisc cd = new BlankDisc("Sgt. Peppers", "The Beatles", tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
