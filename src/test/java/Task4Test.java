import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {
	
	@Test
	public void arrayOfLessThanThreeElementsShouldReturnFalse() {
		Task4 task = new Task4();
		assertFalse(task.modThree(new int[]{}));
		assertFalse(task.modThree(new int[]{1}));
		assertFalse(task.modThree(new int[]{2, 2}));
	}
	
	@Test
	public void arrayOfNotEvenShouldReturnTrue() {
		Task4 task = new Task4();
		assertTrue(task.modThree(new int[]{3, 3, 3}));
		assertTrue(task.modThree(new int[]{9, 3, 1}));
		assertTrue(task.modThree(new int[]{9, 1, 27, 3}));
	}
	
	@Test
	public void arrayOfEvenShouldReturnTrue() {
		Task4 task = new Task4();
		assertTrue(task.modThree(new int[]{2, 2, 2}));
		assertTrue(task.modThree(new int[]{4, 0, 2}));
		assertTrue(task.modThree(new int[]{10, 8, 2, 6}));
	}
	
	@Test
	public void shouldReturnFalse() {
		Task4 task = new Task4();
		assertFalse(task.modThree(new int[]{1, 2, 3, 4}));
		assertFalse(task.modThree(new int[]{2, 4, 7, 5, 22}));
		assertFalse(task.modThree(new int[]{2, 3, 9, 8}));
	}
}
