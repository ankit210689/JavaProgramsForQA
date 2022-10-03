package Programs;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		int a,add,subtract;
		System.out.println("Which operation do you want to perform?");
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division");
		@SuppressWarnings("resource")
		Scanner operation = new Scanner(System.in);
		{
			a=operation.nextInt();
		}
		if (a==1) {
			
			Addition a1=new Addition();
			add=a1.sum;
			System.out.println("The result of addition operation is "+add);
			
		}
		else if (a==2) {
			Subtraction s1=new Subtraction();
			subtract=s1.subtract;
			System.out.println("The result of subtraction is "+subtract);
			
		}
		else System.out.println("Code not ready!");
		
	}
}