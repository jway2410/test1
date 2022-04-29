package lab4;

public class question3 {
	public static int greenLottery (int a, int b, int c) {
		int result;
		if (a != b && b!=c && c!=a) {
			result = 0;
			return result;
		}
		if (a == b && b == c && c == a) {
			result = 20;
			return result;
	} 
	 {
		result = 10;
		return result;
	}
	 
}
		
}