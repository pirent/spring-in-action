package chapter2.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter2.soundsystem.CompactDisc;
import chapter2.soundsystem.SgtPeppers;

@Configuration
public class CdConfig {

	@Bean(name = "lonelyHeartsClub")
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
