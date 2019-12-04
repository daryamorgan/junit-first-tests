package com.dzubairova.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task9Test {
	
	private Task9 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task9();
	}
	
	@Test
	@DisplayName("Fours, no Ones should return true")
	public void foursAndNoOnesShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.no14(new int[]{4, 2, 4, 0});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Ones, no Fours should return true")
	public void OnesAndNoFoursShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.no14(new int[]{1, 1, 0});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Fours and Ones should return false")
	public void foursAndOnesShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.no14(new int[]{1, 4});
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("No fours and no Ones Should return true")
	public void noFoursAndNoOnesShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.no14(new int[]{2, 5});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Empty array should return true")
	public void emptyArrayShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.no14(new int[]{});
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.no14(null));
	}
	
}
