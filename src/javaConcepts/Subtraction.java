package javaConcepts;

import java.util.Scanner;

public class Subtraction {
	
	int n,m,p,subtract=0;
	
	@SuppressWarnings("resource")
	Scanner scan= new Scanner(System.in);{
	System.out.println("How many numbers your want to subtract?");
	n=scan.nextInt();
	
	for (m=1;m<=n;m++) {
		System.out.println("Enter number "+m+ ":");
		p=scan.nextInt();
		subtract=p-subtract;
	}
	scan.close();
	}
}
