package com.dzubairova.task7;

public class Task7 {
	public String repeatSeparator(String word, String sep, int count) {
		if ((word == null) || (sep == null)) {
			throw new NullPointerException();
		}
		
		String newWord = (count > 0) ? word : "";
		
		for (int i = 1; i < count; i++) {
			newWord += sep + word;
		}
		
		return newWord;
	}
}
