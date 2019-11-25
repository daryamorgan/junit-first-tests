import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
	@Test
	public void zeroOccurrenceShouldReturnEmptyString() throws Exception {
		Task2 task = new Task2();
		assertEquals(task.getSandwich("abcbreaz"), "");
		assertEquals(task.getSandwich("xyzbreajd"), "");
		assertEquals(task.getSandwich("a"), "");
	}
	
	@Test
	public void emptyStringShouldReturnEmptyString() throws Exception {
		Task2 task = new Task2();
		assertEquals(task.getSandwich(""), "");
	}
	
	@Test
	public void oneOccurrenceShouldReturnEmptyString() throws Exception {
		Task2 task = new Task2();
		assertEquals(task.getSandwich("bread"), "");
		assertEquals(task.getSandwich("aybreadtbrea"), "");
		assertEquals(task.getSandwich("breabreadbrea"), "");
	}
	
	@Test
	public void twoOccurrenceShouldReturnStringInTheMiddle() throws Exception {
		Task2 task = new Task2();
		assertEquals(task.getSandwich("breadhambread"), "ham");
		assertEquals(task.getSandwich("mbreadbutterbread"), "butter");
		assertEquals(task.getSandwich("brebreadjambreadklp"), "jam");
		assertEquals(task.getSandwich("breadAbread"), "A");
	}
	
	@Test
	public void moreThanTwoOccurrenceShouldReturnStringInTheMiddle() {
		Task2 task = new Task2();
		assertEquals(task.getSandwich("breadbreadjambread"), "breadjam");
		assertEquals(task.getSandwich("breadbreadbreadbread"), "breadbread");
		assertEquals(task.getSandwich("breadKbreadybreadjam"), "Kbready");
	}
}
