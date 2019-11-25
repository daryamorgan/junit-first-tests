public class Task4 {
	public boolean modThree(int[] nums) {
		for (int i = 2; i < nums.length; i++) {
			if ((nums[i - 2] % 2) == (nums[i - 1] % 2) && (nums[i - 1] % 2) == (nums[i] % 2)) {
				return true;
			}
			
		}
		
		return false;
	}
}
