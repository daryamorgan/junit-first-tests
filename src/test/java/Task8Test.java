import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task8Test {
	@Test
	public void OccurrenceOfBobShouldReturnTrue() {
		Task8 task = new Task8();
		assertTrue(task.bobThere("abcbob"));
		assertTrue(task.bobThere("bbb"));
		assertTrue(task.bobThere("123abcbcdbabxyz"));
	}
	
	@Test
	public void wordsLengthLessThanThreeShouldReturnFalse() {
		Task8 task = new Task8();
		assertFalse(task.bobThere("bb"));
		assertFalse(task.bobThere("b"));
		assertFalse(task.bobThere(""));
	}
	
	@Test
	public void noOccurrenceOfBobShouldReturnFalse() {
		Task8 task = new Task8();
		assertFalse(task.bobThere("bon"));
		assertFalse(task.bobThere("bbq"));
		assertFalse(task.bobThere("cdefba"));
	}
}