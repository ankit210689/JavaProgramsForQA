package Programs;

import java.util.Scanner;

public class Add3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define variables x, y and z of type int
		int x,y,z;
		
		//Create an instance of Scanner class to take input from user
		Scanner scan=new Scanner(System.in);
		
		//Print message to enter value of x
		System.out.println("Enter x: ");
		//Assign x the value entered by user
		x=scan.nextInt();
		
		//Print message to enter value of y
		System.out.println("Enter y=");
		//Assign x the value entered by user
		y=scan.nextInt();
		
		//Print message to enter value of z
		System.out.println("Enter z=");
		//Assign z the value entered by user
		z=scan.nextInt();
		
		//Close scanner
		scan.close();
		
		//Print the sum of 3 numbers
		System.out.println("Sum of 3 numbers is "+(x+y+z));
	
	
	}

}
