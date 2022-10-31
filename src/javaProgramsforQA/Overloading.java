package javaProgramsforQA;

public class Overloading {
	public static void maths(int x, int y) {
		int sum=x+y;
		System.out.println(sum);
	}
	public static void maths(int a,int b,int c) {
		int multiply=a*b*c;
		System.out.println(multiply);
	}

	public static void main(String[] args) {//Main method for Overloading class
		maths(2,3);
		maths (2,3,4);

	}

}

class Overriding extends Overloading{
	public static void maths(int x,int y) {
		int multiplication=x*y;
		System.out.println(multiplication);
	}
	
	public static void main(String[] args) {//Main method for Overriding class
		maths (2,3);
		maths (2,3,4);
	}
}
