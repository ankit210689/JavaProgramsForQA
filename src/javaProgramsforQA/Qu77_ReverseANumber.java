package javaProgramsforQA;

import java.util.Scanner;

public class Qu77_ReverseANumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);//Takes user input
		System.out.println("Enter a number to reverse");
		int num=sc.nextInt();//If number entered by user is 1234
		
		
		//https://www.youtube.com/watch?v=m0lMpNIG6vU
		//Logic 1: Using Algorithm
		
		/*int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;//  0*10+1234%10=4  //  4*10+123%10=40+3=43  //  43*10+12%10=432  //  432*10+1%10=4321
			num=num/10;//  1234/10=123  //  123/10=12  //  12/10=1  //  1/10=0--->Since the number is equal to 0 after 4th attempt it will come out of the while loop
		}
		System.out.println("Reversed number is "+rev);//Returns 4321
		*/
		
		//Logic 2: Using StringBuffer Class
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));//String.valueOf is a method of stringbuffer class that converts integer values to string
		StringBuffer rev=sb.reverse();//reverse() method is exclusive to stringbuffer class that reverses the string
		System.out.println("Reversed number is "+rev);
		*/
		
		//Logic 3: Using StringBuilder Class
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);//append() method of stringbuilder class is used and input number "num" has been passed as parameter
		//Now sbl object of stringbuilder class contains the value of num
		StringBuilder rev=sbl.reverse();
		System.out.println("Reversed number is "+rev);
		
		

	}

}
