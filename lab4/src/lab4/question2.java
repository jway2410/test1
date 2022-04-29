package lab4;

public class question2 {

	public boolean squirrel (int temperature, boolean summer) {
		if ((temperature <=100 && temperature >= 60 && summer)||(temperature >=60 && temperature <=90)) {
			return true;}
		else {
			return false;
		}

	}
	
	/*
	 * if (isSummer == true) {
	 *   if(temp <= 100 && temp >= 60) {
	 *   return true;
	 *   }
	 * } else {
	 *   if (temp >= 60 && temp <= 90) {
	 *   return true;
	 *   }
	 *  }
	 *  return false;
	 *  }
	 */

}
