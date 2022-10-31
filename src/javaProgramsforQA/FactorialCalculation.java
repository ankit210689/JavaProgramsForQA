package javaProgramsforQA;

public class FactorialCalculation {
	public static void factorial() {
		int num=4;
		int fact=1;
		for (int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		factorial();

	}

}
