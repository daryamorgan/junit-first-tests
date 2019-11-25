public class Task6 {
	public boolean catDog(String str) {
		int dogCount = 0;
		int catCount = 0;
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i+3).equals("dog")) {
				dogCount += 1;
			}
			
			if (str.substring(i, i+3).equals("cat")) {
				catCount += 1;
			}
			
		}
		
		return catCount == dogCount;
	}
}
