package javaProgramsforQA;

//Q90. How to declare a method in Java?
//Q112. How to get length of an array?
//Q114. How to use enhanced for loop to iterate the array?
//Q115. What is the scope of private access modifiers?
//Q116. What is the scope of public access modifiers?
//Q119. Explain protected access modifiers.
//Explain final keyword.
//Q113---Default keyword remaining----

public class SeparateMethods_Qu90_Qu112_Qu114_Qu115_Qu116_Qu119 {
	
	//Method top2MaxInArray definition
	public static void top2MaxInArray() {//A method or attribute defined as public can be accessed globally by methods in classes residing in same or different packages. This concept is used while creating page objects in Frameworks. 
		
		int a[]= {0,12,1,34,45,65,2,3,4,5,6};
		
		int G1=0;
		int G2=0;
		
		for (int i:a) {//This is an example of enhanced for loop to iterate an array
			if (G1<=i) {
				G2=G1;
				G1=i;
			}
			
			else if (G2<=i) {
				G2=i;
			}
		}
		System.out.println(G1+" and "+G2);
		
	}
	
	//private static void stringReversal() {//A method or attribute defined as private can only be accessed by methods residing in the same class as the private method or attribute
	protected static void stringReversal() {//A method or variable defined as protected can be accessed by methods which reside in same package and from classes which inherit the class in which the method or variable resides. 
		final String str="This is a string";//The value of a variable defined with a final keyword cannot be modified.
		String rev="";
		int len=str.length();//length() method gives the length of an array
		
		for (int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	
	final static void commonValuesInArray() {//A method defined with final keyword cannot be overridden by any subclasses
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4};
		@SuppressWarnings("unused")
		boolean flag=false;
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if (a[i]==b[j]) {
					flag=true;
					System.out.print(a[i]+" ");	
				}
				
			}
		}
		
		if (flag=true) {
			System.out.print("are the common elements");
		}
		else {
			System.out.println("No common element found");
		}
	}

	public static void main(String[] args) {//Calling different methods in main method
		
		top2MaxInArray();
		stringReversal();
		commonValuesInArray();
		
		
		
	}

	
}
