package chapter2.soundsystem;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.soundsystem.config.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
@ActiveProfiles("linkinpark")
public class CdPlayerTest {

	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertThat(cd, is(notNullValue()));
	}
	
	@Test
	public void playShouldBePlayable() {
		assertThat(player, instanceOf(CdPlayer.class));
		player.play();
	}
}
