import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {
	@Test
	public void countEqualsZeroShouldReturnEmptyString() {
		Task7 task = new Task7();
		assertEquals(task.repeatSeparator("AAA", "", 0), "");
		assertEquals(task.repeatSeparator(" ", "and", 0), "");
	}
	
	@Test
	public void simpleTests() {
		Task7 task = new Task7();
		assertEquals(task.repeatSeparator("abc", "and", 3), "abcandabcandabc");
		assertEquals(task.repeatSeparator("Hi", "And", 2), "HiAndHi");
		assertEquals(task.repeatSeparator("XYZ", "", 1), "XYZ");
		assertEquals(task.repeatSeparator("abc", " ", 2), "abc abc");
	}
}
