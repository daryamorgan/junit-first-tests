package com.dzubairova.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {
	
	private Task3 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task3();
	}
	
	@Test
	@DisplayName("Zero star should return true")
	public void zeroStarOccurrenceShouldReturnTrue(){
		///WHEN
		boolean actualResult = task.sameStarChar("abcDEF");
		
		///THEN
		assertTrue(actualResult);
		
	}
	
	@Test
	@DisplayName("Matching symbols around star should return true")
	public void matchingSymbolsAroundStarShouldReturnTrue() {
		///WHEN
		boolean actualResult1 = task.sameStarChar("a*a");
		
		///THEN
		assertTrue(actualResult1);
	}
	
	@Test
	@DisplayName("Not matching symbols around star should return false")
	public void notMatchingSymbolsShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.sameStarChar("**-");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Empty string should return true")
	public void emptyStringShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.sameStarChar("");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.sameStarChar(null));
	}
}

