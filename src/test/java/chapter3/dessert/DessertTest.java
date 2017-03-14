package chapter3.dessert;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DessertConfig.class})
public class DessertTest {

	@Autowired
	private Consumer consumer;
	
	@Test
	public void consumerShouldHaveARightDessert() {
		consumer.havingDessert();
		fail("Not yet implemented");
	}
}
