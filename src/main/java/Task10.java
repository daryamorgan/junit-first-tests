public class Task10 {
	public boolean has22(int[] nums) {
		boolean flag = false;
		for (int i=0; i<nums.length-1; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				flag = true;
				break;
			}
			
		}
		
		return flag;
	}
}
