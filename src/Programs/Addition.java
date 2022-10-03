package Programs;

import java.util.Scanner;

public class Addition {
	int n,m,p,sum=0;
	
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);{
	System.out.println("How many numbers to add? ");
	n=scan.nextInt();
	
	for (m=1;m<=n;m++) {
		System.out.println("Enter number "+m+ ":");
		p=scan.nextInt();
		sum=sum+p;
	}
	scan.close();
}
}