package com.dzubairova.task2;

public class Task2 {
	public String getSandwich(String str) {
		String word = "bread";
		int firstOccurrence = str.indexOf(word);
		int lastOccurrence = str.lastIndexOf(word);
		
		if (firstOccurrence != lastOccurrence) {
			return str.substring(firstOccurrence + word.length(), lastOccurrence);
		}
		
		return "";
	}
}
