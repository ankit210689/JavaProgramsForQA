/**
 * 
 */
package javaConcepts;

import java.util.Scanner;

public class primenumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number:");
			
			int i,m=0,flag=0;
			int n=sc.nextInt();//it is the number to be checked
			m=n/2;
			if (n==0||n==1)
			{
				System.out.println(n+" is not a prime number");
			}
			else
			{
				for (i=2;i<=m;i++) {
					if (n%i==0) {
						System.out.println(n+" is not a prime number");
					flag=1;
					break;	
			}}
			
				if (flag==0)
				{System.out.println(n+" is a prime number");
			}
}
		}
	}}