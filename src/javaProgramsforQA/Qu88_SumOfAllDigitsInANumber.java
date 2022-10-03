package javaProgramsforQA;


import java.util.Scanner;

//Q107. Write syntax and example of "while" loop.

@SuppressWarnings("unused")
public class Qu88_SumOfAllDigitsInANumber {

	public static void main(String[] args) {
		
		/*//For taking input number from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int sum=0;*/
		
		int num=1234;
		
		int sum=0;
		
		while (num>0) {//1234>0//123>0//12>0//1>0//0!>0 and so while loop terminates here
			
			sum=sum+(num%10);//4//3//2//1
			
			num=num/10;//123//12//1//0
		}
		
		System.out.println("Sum of all digits in number is "+sum);
		
		

	}

}
