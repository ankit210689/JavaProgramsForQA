package javaProgramsforQA;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str="This is a string gnirts a si siht";
		String rev="";
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {//Compares strings ignoring the case of each alphabet
		//if (str.equals(rev)) {//Compares strings as they are including case of each alphabet
			System.out.println("String is A Palindrome");
		}
		else {
			System.out.println("String is not A Palindome");
		}

	}

}
