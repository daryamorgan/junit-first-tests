import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test {
	@Test
	public void zeroXOccurrenceShouldReturnTrue() throws Exception {
		Task1 task = new Task1();
		assertTrue(task.xyBalance("aby"));
		assertTrue(task.xyBalance("y"));
		assertTrue(task.xyBalance("yaayb"));
	}
	
	@Test
	public void oneXOneYOccurrenceShouldReturnBalancedTrue() throws Exception {
		Task1 task = new Task1();
		assertTrue(task.xyBalance("aaxbby"));
		assertTrue(task.xyBalance("xy"));
		assertTrue(task.xyBalance("axyb"));
	}
	
	@Test
	public void MultipleXzeroYOccurrenceShouldReturnBalancedFalse() throws Exception{
		Task1 task = new Task1();
		assertFalse(task.xyBalance("aaxbb"));
		assertFalse(task.xyBalance("axaxxxbx"));
		assertFalse(task.xyBalance("x"));
	}
	
	@Test
	public void multipleXOneYOccurrenceShouldReturnBalancedTrue() {
		Task1 task = new Task1();
		assertTrue(task.xyBalance("xxxxxy"));
		
	}
	
}
