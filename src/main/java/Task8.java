public class Task8 {
	public boolean bobThere(String str) {
		boolean flag = false;
		for (int i=0; i<str.length()-2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
				flag = true;
			}
			
		}
		
		return flag;
	}
}
