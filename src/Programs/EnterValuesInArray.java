package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class EnterValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		
		
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		System.out.println("Enter number of values to store in array :");
		n=number.nextInt();
		
		String[] names= new String[n];
		
		System.out.println("Enter values");
		
		for (m=0;m<n;m++){
			
			@SuppressWarnings("resource")
			Scanner values=new Scanner(System.in);
			names[m]=values.next();
		}
		System.out.println("Contents of the array are "+Arrays.toString(names));
		}
		
		 {

	}

}
