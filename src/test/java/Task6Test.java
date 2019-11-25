import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6Test {
	@Test
	public void equalZeroOccurrenceShouldReturnTrue() {
		Task6 task = new Task6();
		assertTrue(task.catDog(""));
		assertTrue(task.catDog("c"));
		assertTrue(task.catDog("ca"));
		assertTrue(task.catDog("don"));
	}
	
	@Test
	public void equalMultipleOccurrenceShouldReturnTrue() {
		Task6 task = new Task6();
		assertTrue(task.catDog("catdog"));
		assertTrue(task.catDog("dogdocat"));
		assertTrue(task.catDog("ocatodogodogocat"));
	}
	
	@Test
	public void unequalOccurrenceShouldReturnFalse() {
		Task6 task = new Task6();
		assertFalse(task.catDog("cat"));
		assertFalse(task.catDog("cadog"));
		assertFalse(task.catDog("dogdog"));
		assertFalse(task.catDog("dogdogcat"));
	}
}
