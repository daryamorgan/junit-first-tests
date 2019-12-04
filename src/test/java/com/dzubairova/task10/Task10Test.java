package com.dzubairova.task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task10Test {
	
	private Task10 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task10();
	}
	
	@Test
	@DisplayName("2 next to 2 should return true")
	public void twoNextToTwoShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.has22(new int[]{2, 2});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("2 not next to 2 should return false")
	public void twoNotNextToTwoShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.has22(new int[]{2});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Empty array should return false")
	public void emptyArrayShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.has22(new int[]{});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.has22(null));
	}
}
