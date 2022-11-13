package javaProgramsforQA;

public class ConcatenateMultipleStrings {
	public static void concatenate() {
		String str1="This";
		String str2=" is a ";
		String str3="complete string.";
		
		//Approach 1
		/*String concatenate=str1+str2+str3;*/
		
		//Approach 2
		/*String concatenate=str1.concat(str2);
		concatenate=concatenate.concat(str3);*/
		
		
		//Approach 3
		String concatenate=str1.concat(str2).concat(str3);
		System.out.println(concatenate);
	}
	

	public static void main(String[] args) {
		concatenate();

	}

}
