public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word1){
		if (word1.toLowerCase().endsWith("ey")) {
			return "eys";
		}
		else if (word1.toLowerCase().endsWith("y")){
			return "ies";
		} 
		else if (word1.toLowerCase().endsWith("ife")) {
			return "ives";

		}
		else {
			return "s";
		}

	}
	public static int min(int x, int y, int z) {
		int a=Math.min(y, z);
		a=Math.min(x,a);
		return a;
	}

	public static boolean isLeapYear(int x) {
		if (x%4==0){
			if (x%100==0) {
				if (x%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
		}
	}
		else {
			return false;
		}
	}

}
