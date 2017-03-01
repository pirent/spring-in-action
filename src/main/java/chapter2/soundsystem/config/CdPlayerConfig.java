package chapter2.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter2.soundsystem.CdPlayer;
import chapter2.soundsystem.CompactDisc;

@Configuration
//@ComponentScan(basePackages="chapter2.soundsystem")
//@ComponentScan(basePackageClasses={MediaPlayer.class})
public class CdPlayerConfig {

	@Bean
	public CdPlayer cdPlayer(CompactDisc cd) {
		// It's OK for doing that
		// return new CdPlayer(sgtPeppers());
		// But the best choice approach is inject another bean instance
		// because it doesn't depend on the CompactDis bean being declared
		// in the same configuration class
		CdPlayer cdPlayer = new CdPlayer();
		cdPlayer.setCompactDisc(cd);
		return cdPlayer;
	}
}
