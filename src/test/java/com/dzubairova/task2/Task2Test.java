package com.dzubairova.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2Test {
	
	private Task2 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task2();
	}
	
	@Test
	@DisplayName("Zero occurrence should return empty string")
	public void zeroOccurrenceShouldReturnEmptyString() {
		///WHEN
		String actualResult = task.getSandwich("xyzbreajd");

		///THEN
		String expectedResult = "";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Empty string should return empty string")
	public void emptyStringShouldReturnEmptyString() {
		///WHEN
		String actualResult = task.getSandwich("");
		
		///THEN
		String expectedResult = "";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("One occurrence should return empty string")
	public void oneOccurrenceShouldReturnEmptyString() {
		///WHEN
		String actualResult = task.getSandwich("breadbre");
		
		///THEN
		String expectedResult = "";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Two occurrence should return string in the middle")
	public void twoOccurrenceShouldReturnStringInTheMiddle() throws Exception {
		///WHEN
		String actualResult = task.getSandwich("breadhambread");
		
		///THEN
		String expectedResult = "ham";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Multiple occurrence should return string in the middle")
	public void moreThanTwoOccurrenceShouldReturnStringInTheMiddle() {
		///THEN
		String actualResult = task.getSandwich("breadbreadbread");
		
		///WHEN
		String expectedResult = "bread";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.getSandwich(null));
	}
}
