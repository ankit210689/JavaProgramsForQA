package javaProgramsforQA;

import java.util.Scanner;

public class Qu89_PrimeNumberCheck {
	//Prime Number: A natural number (>1) which has only 2 factors ie. 1 and itself.
	//For eg. 2, 3, 5, 7, 11, 13, 17 etc.
	
	//So we will implement 2 conditons to identify Prime Number: 1) Number >1 and 2) Number can have only 2 factors.
	 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num=sc.nextInt();
		
		
		//int num=3;
		
		int count=0;
		
		if (num>1) {//First if condition to check if the number is >1 which is the first condition for a prime number
			
			for(int i=1;i<=num;i++) {//Next initializing integer variable i and running the for loop for all values of i from 1 to num
				
				if (num%i==0) {//If condition to check the whole division of input number with each value of i to give remainder 0
					count++;//Increment the count value for each whole division
				}
			}
			if (count==2) {//If condition to check the final value of count variable. This is validating second condition for prime number ie. a prime number only have 2 factors 
				System.out.println("Prime Number");
			}
			else {//If final value of count is <2
				System.out.println("Not a Prime Number");
			}
			
			
		}
		else {//If first condition ie. num>1 fails
			System.out.println("Not a Prime number");
		}
		

	}

}
