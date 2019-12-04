package com.dzubairova.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7Test {
	
	private Task7 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task7();
	}
	
	@Test
	@DisplayName("Count zero should return empty string")
	public void countEqualsZeroShouldReturnEmptyString() {
		///WHEN
		String actualResult = task.repeatSeparator("hi", " ", 0);
		
		///THEN
		String expectedResult = "";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Negative count should return empty string")
	public void negativeCountShouldReturnEmptyString() {
		///WHEN
		String actualResult = task.repeatSeparator("hi", " ", -5);
		
		///THEN
		String expectedResult = "";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null word")
	public void nullWordShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.repeatSeparator(null, " ", 2));
	}
	
	@Test
	@DisplayName("Throws exception on null separator")
	public void nullSeparatorShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.repeatSeparator("yes", null, 2));
		
	}
	
}
