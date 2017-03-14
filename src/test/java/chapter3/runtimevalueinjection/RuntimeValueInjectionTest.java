package chapter3.runtimevalueinjection;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.soundsystem.BlankDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ExpressiveConfig.class})
public class RuntimeValueInjectionTest {

	@Autowired
	private BlankDisc disc;
	
	@Autowired
	private Transformer transformer;
	
	@Test
	public void shouldBeInjectedWithRuntimeValue() {
		disc.play();
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldBeAbleToWorkWithPlaceholder() {
		transformer.rollOut();
		fail("Not yet implemented");
	}
}
