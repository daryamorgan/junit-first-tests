package com.dzubairova.task5;

public class Task5 {
	public boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1) {
				return true;
			}
		}
		
		return false;
	}
}
