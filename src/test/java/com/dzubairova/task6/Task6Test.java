package com.dzubairova.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task6Test {
	
	private Task6 task;
	
	@BeforeEach
	public void initTest() {
		///GIVEN
		task = new Task6();
	}
	
	@Test
	@DisplayName("equal zero occurrence should return true")
	public void equalZeroOccurrenceShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.catDog("don");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Equal multiple occurrence should return true")
	public void equalMultipleOccurrenceShouldReturnTrue() {
		///WHEN
		boolean actualResult = task.catDog("cat1dog1dog2cat2");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Unequal occurrence should return false")
	public void unequalOccurrenceShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.catDog("cat");
		
		///THEN
		assertFalse(actualResult);
	}
	
	@Test
	@DisplayName("Empty string should return true")
	public void emptyArrayShouldReturnFalse() {
		///WHEN
		boolean actualResult = task.catDog("");
		
		///THEN
		assertTrue(actualResult);
	}
	
	@Test
	@DisplayName("Throws exception on null")
	public void nullShouldReturnException() {
		assertThrows(NullPointerException.class, () -> task.catDog(null));
	}
}
