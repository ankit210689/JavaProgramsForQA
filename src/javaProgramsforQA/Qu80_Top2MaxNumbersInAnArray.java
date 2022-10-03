package javaProgramsforQA;

//Q110. How to set default values while arrays are initialized?

public class Qu80_Top2MaxNumbersInAnArray {

	public static void main(String[] args) {
		
		int a[]= {100,82,39,400,58,69};//Array with integer values is initialized
		int G1=0;//Integer variables G1 and G2 defined and initialized as 0.
		int G2=0;
		
		for (int i:a) {//i for all values of array a[]
			
			if (G1<=i) {//Intially G1=0 and i=100 ie. first element of array a[]. Since the condition G1<i satisfies, if statment will be executed
					G2=G1;//G2=0
					G1=i;//G1=100
				}
				
				else if (G2<=i) { //In second attempt G1=100 and i=82, so first if coodition does not satisfy. Hence, else if statement will be executed
					G2=i;//G2=82
					//Similarly for next value of i=39, G1=100, G2=82. Here, since both G1<i and G2<i fails, none of the conditions will execute and values of G1 and G2 remains 100 and 82 respectively.
					//Next value of i=400, G1=100, G2=82. Here, since G1<i,if statement will execute to assign G2=100 and G1=400. 
					//Next value of i is 58. Here, both G1<i and G2<i conditions fails. So assigned values remains G1=400 and G2=100.
					//Next value of i is 69. Here, both G1<i and G2<i conditions fails. So assigned values remains G1=400 and G2=100.
					//Since, 69 is the last value in array, for loop terminates and println statement gets executed to give final values of G1 and G2 as 400 and 100 respectively.
				}		
		}
		System.out.println("Top 2 maximum numbers in array are "+G1+ " and "+G2);
		

	}

}
