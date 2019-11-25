import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task10Test {
	@Test
	public void twoNextToTwoShouldReturnTrue() {
		Task10 task = new Task10();
		assertTrue(task.has22(new int [] {2, 2}));
		assertTrue(task.has22(new int [] {2, 2, 1, 2}));
	}
	
	@Test
	public void twoNotNextToTwoShouldReturnFalse() {
		Task10 task = new Task10();
		assertFalse(task.has22(new int [] {2}));
		assertFalse(task.has22(new int [] {2, 0, 1, 2}));
		assertFalse(task.has22(new int [] {}));
		assertFalse(task.has22(new int [] {2, 5, 2, 5, 2}));
	}
}
