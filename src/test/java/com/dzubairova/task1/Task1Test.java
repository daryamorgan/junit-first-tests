package com.dzubairova.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1Test {
	
	private Task1 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task1();
	}
	
	@Test
	@DisplayName("Zero X should return true")
	public void zeroXOccurrenceShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.xyBalance("aby");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("One X and one Y should return true")
	public void oneXOneYOccurrenceShouldReturnBalancedTrue() {
		///WHEN
		boolean actualResult = task.xyBalance("aaxbby");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Multiple X and zero Y should return false")
	public void multipleXzeroYOccurrenceShouldReturnBalancedFalse() {
		///WHEN
		boolean actualResult = task.xyBalance("axaxxxbx");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Multiple X and one Y should return true")
	public void multipleXOneYOccurrenceShouldReturnBalancedTrue() {
		///WHEN
		boolean actualResult = task.xyBalance("xxxxxy");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Empty string should return true")
	public void emptyStringShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.xyBalance("");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.xyBalance(null));
	}
}
