package javaProgramsforQA;

import java.util.Scanner;

public class Qu85_Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intialize variables x,y
		int x,y;
		
		//Take values for x and y
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Value of x:");
		x=scan.nextInt();
		System.out.println("Enter Value of y:");
		y=scan.nextInt();
		
		//Logic#1: Third variable
		
		//Initialize z and Assign value of x to z
		/*int z=x;
		//Assign value of y to x
		x=y;
		//Assign value of z to y
		y=z;*/
		
		//Logic#2: Only using + & - operators and without third variable
		
		/*x=x-y; //Assign x the difference between x and y values
		y=y+x; //Assign y the value by adding it's original value with difference value ie. new x
		x=y-x; //Assign x the value by subtracting new y value by the difference value ie. new x
		*/
		
		//Logic#3: Using * and / operators and it applies only if both x and y are non-zero
		/*x=x*y; //Assign x the multiplied value of x and y
		y=x/y; //Assign y the divided value of new x and original y
		x=x/y; //Assign x the divided value of new x and new y*/
		
		//Logic#4: Using bitwise XOR (^) (Understand XOR table and check decimal and binary values conversion)
		/*x=x^y;//Assign x the value of XOR operation between original x and y
		y=x^y;//Assign y the value of XOR operation between new x and original y
		x=x^y;//Assign x the value of XOR operation between new x and new y*/
		
		//Logic#5: Single statement
		y=x+y-(x=y);//Execution will happen right to left. So, original value of y will become new value of x (operation in bracket), and on left x+y will be performed to before subtracting it with new x. This will swap both x and y values.
		
		
		//Now print the new values and x and y
		System.out.println("Swapped value of x: "+x+"\nSwapped value of y: "+y);

	}

}
