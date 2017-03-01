package chapter3;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MagicConfig.class })
public class AdvancedWiringTesting {

	@Autowired
	private MagicBean magicBean;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("magicalEnv", "true");
	}
	
	@Test
	public void magicBeanShouldExistWhenMagicalEnvIsSetup() {
		assertThat(magicBean, is(notNullValue()));
	}
}
