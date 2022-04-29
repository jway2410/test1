package lab4;

public class question1 {

	public int sum(int a, int b) {
		
		String str1 = Integer.toString(a + b);
		String str2 = Integer.toString(a);
		
		if(str1.length() == str2.length()) {
			return a+b;}
		else {
			return a;}
	
}
}

