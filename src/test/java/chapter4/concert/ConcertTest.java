package chapter4.concert;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConcertConfig.class})
public class ConcertTest {

	@Autowired
	Performance opera;
	
	@Test
	public void audienceShouldDoSomethingWhenOperaIsPlayed() {
		opera.perform();
		Assert.fail("Not yet implemented");
	}
	
	@Test
	public void performanceWithIntroductionToEncorable() {
		opera.perform();
	}
}
