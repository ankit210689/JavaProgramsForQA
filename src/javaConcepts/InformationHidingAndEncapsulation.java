package javaConcepts;

//Q97. Why information hiding is used and how information hiding is implemented in Java.
//Q98. What is the relevance of "this" keyword in Java?

public class InformationHidingAndEncapsulation {
	
	/*1
	 //Class implementation without encapsulation
	public class BankAccount{
		public int dollars;
	}
	//The implementation of this class is completely unencapsulated, which means it is inflexible and unsafe.
	//Inflexible because we can't easily add support for individual "cents" in future.
	//Unsafe because the account can changed to be negative.
	 1*/
	
	/*2
	//If we hide the data behind a formally defined interface of methods, we gain flexibility and safety.
	public class BankAccount{
		private int dollars;
		
		public void deposit(int dollars) {
			this.dollars +=Math.max(0, dollars);//dollars attribute of deposit method is being referenced here
			//"this" keyword is used to resolve the ambiguity between instance variable and parameters.
			
		}
	}
	//We now have control over how the state is modified, and we can also change the implementation without breaking client code.
	2*/
	
	//3--Further encapsulating class to hide information about it's underlying implementation.
	public class BankAccount{
		@SuppressWarnings("unused")
		private int cents;
		
		public void deposit(int dollars) {
			deposit (dollars,0);
		}
		public void deposit(int dollars,int cents) {
			this.cents +=Math.max(0, 100*dollars)+Math.max(0, cents);//cents attribute in deposit method is being referenced here
			//"this" keyword is used to resolve the ambiguity between instance variable and parameters.
		}
	}
	//This class is now better encapsulated because we have hidden information about its underlying implementation.
	//3
	
	

	public static void main(String[] args) {
		
	}

}
