package lab4;

public class question4 {
	public int countXX(String str) {
	int counter = 0;
	if (str==null) {
		counter = 0;
		return counter;
	}
	
	
	for (int i = 0; i < str.length()-1; i++) {
		if (str.charAt(i) == 'x' && str.charAt(i+1) =='x') {
			counter++;
		}
	}
	return counter;
	}
}
