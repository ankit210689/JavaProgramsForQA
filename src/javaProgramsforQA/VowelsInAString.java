package javaProgramsforQA;

public class VowelsInAString {

	public static void main(String[] args) {
		String str="Find vowels in this string";
		int count=0;
		
		for (int i=0;i<str.length();i++) {//for loop to run for all characters in string str
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			//if statement to check the presence of vowels using conditional operator "||" also known as the logical OR operator
				/* 
				 * In all there are 3 types of conditional/logical operators:
				 * AND (&&)--eg. int x=20, y=30; if (x>10??y>20){System.out.println(Success);}--->Return "Success"
				 * OR(||)
				 * Ternary (?:)--eg 1. int x=20; int y=(x==20)?30:40;System.out.println(y);--->Returns 30
				 * eg 2. int x=20;
				 * int y=(x==10)?30:40;
				 * System.out.println(y);--->Returns 40
				 * Ternary operator consists of 3 operands: (Demo eg 2.)
				 * 1) x==10 is operand 1 and it's boolean result will decide which operand will be performed out of the next 2
				 * 2) ?30--->If x==10 is true, y will be assigned value 30
				 * 3) :40--->If x==10 is false, y will be assigned value 40 
				 */
				
				System.out.print(str.charAt(i)+" ");
				count++;
			}
		}
		System.out.print("are the vowels in this string. In all there are "+count+" vowels.");


	}
	
}
