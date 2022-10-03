package javaProgramsforQA;

//Q106. Write syntax and example of "for" loop.

public class Qu86_FibonacciSeries {
	//Fibonacci Series: A series of numbers in which each number is the sum of the 2 preceding numbers.
	//For eg. 0,1,1,2,3,5,8,13 etc.

	public static void main(String[] args) {
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);//First 2 numbers in the series ie. 0 and 1 are printed as it is.//---->ln is removed from println to print all results on same line
		
		for (int i=2;i<10;i++) {
			
			sum=n1+n2; //0+1//1+1//1+2
			System.out.print(" "+sum);//1//2//3//---->ln is removed from println to print all results on same line
			n1=n2;//n1=1//n1=1//n1=2
			n2=sum;//n2=1//n2=2//n2=3 and so on till i<10
		}
		

	}

}
