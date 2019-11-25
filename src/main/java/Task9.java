public class Task9 {
	public boolean no14(int[] nums) {
		int count1 = 0;
		int count4 = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == 1) {
				count1 += 1;
			}
			
			else if (nums[i] == 4) {
				count4 += 1;
			}
			
		}
		
		return (count1 == 0) ^ (count4 == 0) || (count1 == 0) && (count4 == 0);
	}
}
