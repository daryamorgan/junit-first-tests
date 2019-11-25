import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

	@Test
	public void zeroStarOccurrenceShouldReturnTrue() throws Exception {
		Task3 task = new Task3();
		assertTrue(task.sameStarChar(""));
		assertTrue(task.sameStarChar("abcDEF"));
	}
	
	@Test
	public void matchingSymbolsAroundStarShouldReturnTrue() {
		Task3 task = new Task3();
		assertTrue(task.sameStarChar("*"));
		assertTrue(task.sameStarChar("a*a"));
		assertTrue(task.sameStarChar("a5*5b"));
		assertTrue(task.sameStarChar("aa*ac*c*cba"));
	}
	
	@Test
	public void notMatchingSymbolsShouldReturnFalse() {
		Task3 task = new Task3();
		assertFalse(task.sameStarChar(" *a"));
		assertFalse(task.sameStarChar("a*b"));
		assertFalse(task.sameStarChar("**-"));
		assertFalse(task.sameStarChar("a*a*b"));
		
	}
}
