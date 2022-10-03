package javaProgramsforQA;

public class Qu74_StringReversal {

	public static void main(String[] args) {
		
		String str="This is a string";//Input string
		
		//String rev=null;---->If we initialize a string as null the java console will add it as a string value to the output.
		//Instead we will make it an empty string as below.
		@SuppressWarnings("unused")
		String rev="";//Output string that will be used to store reversed string.
		
		//https://www.youtube.com/watch?v=1_hhywLAO5o
		//Logic 1: Using + (string concatenation) operator
		
		/*int len=str.length();//integer object len has been assigned the total length of input string
		
		
		for (int i=len-1;i>=0;i--) {//For loop to start from end of the string till the beginning
			
			rev=rev+str.charAt(i);//Starts with last value of input string ie. 'g' and ends with 'T' 
			//charAt method has been used to fetch each character in input string in reverse order
			//and each value has been concatenated to previously stored value of rev using + operator
			
		}
		System.out.println("Reversed String is "+rev);*/
		
		
		//Logic 2: Using character array
		
		/*char a[]=str.toCharArray();//toCharArray method breaks a string into characters and assign each character into an array
		int len=a.length;//length keyword assigns length of array a to variable len
		
		for (int i=len-1;i>=0;i--) {//For loop applied in reverse order
			rev=rev+a[i];//Each value stored in array gets assigned to variable rev one by one in reverse order
		}
		System.out.println("Reversed String is "+rev);*/
		
		
		//Logic 3: Using String buffer class
		
		StringBuffer sb=new StringBuffer(str);//Object created for StringBuffer class and value of string variable str has been passed to it
		System.out.println(sb.reverse());//reverse() is an existing method in stringbuffer class
		

	}

}
