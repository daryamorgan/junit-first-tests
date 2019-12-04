package com.dzubairova.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task5Test {
	
	private Task5 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task5();
	}
	
	@Test
	@DisplayName("Array of less three elements should return false")
	public void lessThanThreeElementsShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.tripleUp(new int[]{1});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Array with no three increasing elements should return false")
	public void ArrayOfNoThreeIncreasingElementsShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.tripleUp(new int[]{1, 2, 4});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Array with three increasing elements should return true")
	public void ArrayOfThreeIncreasingElementsShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.tripleUp(new int[]{-99, 100, 101, 102});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Empty array should return false")
	public void emptyArrayShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.tripleUp(new int[]{});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.tripleUp(null));
	}
}
