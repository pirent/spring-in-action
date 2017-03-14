package chapter4.soundsystem;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.soundsystem.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter trackCounter;
	
	@Test
	public void testTrackCounter() {
		cd.playTrack(1);
		cd.playTrack(0);
		cd.playTrack(0);
		cd.playTrack(2);
		cd.playTrack(1);
		
		assertThat(trackCounter.getPlayCount(1), is(2));
		assertThat(trackCounter.getPlayCount(2), is(1));
	}
}
