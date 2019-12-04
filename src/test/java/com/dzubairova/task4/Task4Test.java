package com.dzubairova.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4Test {
	
	private Task4 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task4();
	}
	
	@Test
	@DisplayName("Array of less than three elements should return false")
	public void arrayOfLessThanThreeElementsShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.modThree(new int[]{2, 2});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Array of not even numbers should return true")
	public void arrayOfNotEvenShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.modThree(new int[]{3, 3, 3});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Array of even numbers should return true")
	public void arrayOfEvenShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.modThree(new int[]{4, 0, 2});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Array of both even and uneven numbers should return false")
	public void shouldReturnFalse() {
		///WHEN
		boolean actualResult = task.modThree(new int[]{1, 2, 3, 4});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Empty array should return false")
	public void emptyArrayShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.modThree(new int[]{});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.modThree(null));
	}
	
}
