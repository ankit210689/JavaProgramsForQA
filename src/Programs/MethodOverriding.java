package Programs;

public class MethodOverriding {
	
	static class Animal{
		public void eat() {
			//Animal Code
			System.out.println("Animal is eating");
		}
	}
	
	static class Dog extends Animal{
		public void eat() {
			//Modified animal code for Dog
			System.out.println("Boy is eating");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Dog dog=new Dog();
			dog.eat();

		}
	}	

}

//Same method has been declared in child class with same access modifier and parameters is called Method Overriding

/*Differences between overloading and Overriding
 * Overloading|Overriding
 * ===========|==========
 * Occurs within one class | Occurs in 2 classes: Super class and sub class ie. inheritence is involved.
 * Name of the method is same but different parameters | Name and parameters both are same
 * Purpose: Increases the readability of program | Purpose: Use the method in Child class which is already present in Parent class
 * Return type can be same or different | Return type is always same
 * It is an example of Compile Time Polymorphism | It is an example of Run Time Polymorphism
 */
