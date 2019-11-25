import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task9Test {
	@Test
	public void foursAndNoOnesShouldReturnTrue() {
		Task9 task = new Task9();
		assertTrue(task.no14(new int [] {4}));
		assertTrue(task.no14(new int [] {4, 5, 6}));
		assertTrue(task.no14(new int [] {4, 2, 4, 0}));
		
	}
	
	@Test
	public void OnesAndNoFoursShouldReturnTrue() {
		Task9 task = new Task9();
		assertTrue(task.no14(new int [] {1}));
		assertTrue(task.no14(new int [] {1, 1, 0}));
		assertTrue(task.no14(new int [] {9, 5, 1, 3}));
	
	}
	
	@Test
	public void foursAndOnesShouldReturnFalse() {
		Task9 task = new Task9();
		assertFalse(task.no14(new int [] {1, 4}));
		assertFalse(task.no14(new int [] {1, 4, 4, 4, 5}));
		assertFalse(task.no14(new int [] {1, 1, 0, 1, 4}));
	}
	
	@Test
	public void noFoursAndNoOnesShouldReturnTrue() {
		Task9 task = new Task9();
		assertTrue(task.no14(new int [] {}));
		assertTrue(task.no14(new int[]{5}));
		assertTrue(task.no14(new int[]{0, 2, 5, 9}));
	}

	
}
