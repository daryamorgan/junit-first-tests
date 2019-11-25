import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {
	@Test
	public void lessThanThreeElementsShouldReturnFalse() {
		Task5 task = new Task5();
		assertFalse(task.tripleUp(new int []{}));
		assertFalse(task.tripleUp(new int []{1}));
		assertFalse(task.tripleUp(new int []{1, 2}));
	}
	
	@Test
	public void ArrayOfNoThreeIncreasingElementsShouldReturnFalse() {
		Task5 task = new Task5();
		assertFalse(task.tripleUp(new int[]{1, 2, 4}));
		assertFalse(task.tripleUp(new int[]{2, 3, 5, 6, 8, 9, 2, 3}));
		assertFalse(task.tripleUp(new int[]{10, 9, 8, -100, -99, 99, 100}));
	}
	
	@Test
	public void ArrayOfThreeIncreasingElementsShouldReturnTrue() {
		Task5 task = new Task5();
		assertTrue(task.tripleUp(new int[]{1, 2, 3}));
		assertTrue(task.tripleUp(new int[]{1, 4, 5, 6, 2}));
		assertTrue(task.tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
	}
}
