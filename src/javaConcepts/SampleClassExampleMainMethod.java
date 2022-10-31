package javaConcepts;

//Q94. Write a sample Java class.
//Q96. How to access object members in Java?

public class SampleClassExampleMainMethod {

	public static void main(String[] args) {
		
		SampleClassExample object=new SampleClassExample();//We need create an object of the other class without the main method
		object.simpleMessage();//Use the object reference to call simpleMessage() method created in other class (Q96)
		//Dot operator (.) is used because there can be multiple methods defined in SampleClassExample class that we need to refer depending on the requirement
		
		//Now this program will run to show the message entered in class without the main method.

	}

}
