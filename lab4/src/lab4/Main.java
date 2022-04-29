package lab4;

public class Main {

	public static void main(String[] args) {
		
		question1 question1Object = new question1();
		question1Object.sum(0, 0);
		System.out.println(question1Object.sum(8,2));
		
		question2 question2Object = new question2();
		question2Object.squirrel(0, false);
		System.out.println(question2Object.squirrel(95, true));
		
		question3 question3Object = new question3();
		question3Object.greenLottery(0, 0, 0);
		System.out.println(question3Object.greenLottery(1, 2, 2));
		
		question4 question4Object = new question4();
		System.out.println(question4Object.countXX(null));
		System.out.println(question4Object.countXX("xxxxx"));
		
		question5 question5Object = new question5();
		System.out.println(question5Object.repeatedString(null, 0));
		System.out.print(question5Object.repeatedString("hi",3));
	}

}
