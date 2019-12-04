package com.dzubairova.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task8Test {
	
	private Task8 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task8();
	}
	
	@Test
	@DisplayName("Bob should return true")
	public void occurrenceOfBobShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.bobThere("bbb");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Words less than three letters should return false")
	public void wordsLengthLessThanThreeShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.bobThere("bb");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Empty string should return false")
	public void emptyStringShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.bobThere("");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("No bob should return false")
	public void noOccurrenceOfBobShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.bobThere("cdefba");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.bobThere(null));
	}
}