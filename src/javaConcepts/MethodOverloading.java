package javaConcepts;

//Q123. Why overloading is used?-->When we want to implement methods that have some basic functionality but accepts different arguments, overloading is used.
//When we implement overloaded method, argument must differ, return type can differ (but it's not mandatory)


public class MethodOverloading {
	
	//3 methods are defined with same name (sum) but different number of input parameters
	public static void sum() {
		return;
	}
	
	public static String sum (String x, String y) {//Same method name, Different kind and number of arguments. Return type kept the same.
		return x+y;
	}
	
	public static int sum(int x, int y) {//Same method name, Different kind and number of arguments. Return type kept the same.
		return x+y;
	}
	
	public static int sum (int x,int y, int z) {//Same method name, Different kind and number of arguments. Return type kept the same.
		return x+y+z;
	}
	
	public static void main (String[] args) {
		//Depending upon the number of parameters given compiler will call the method to provide the output
		System.out.println(sum(2,3));//Method "sum" with 2 input parameters is called
		System.out.println(sum(2,3,4));//Method "sum" with 3 input parameters is called
		System.out.println(sum("Ankit","Pandey"));//Method "sum" with 2 string input parameters is called
	}

}

//Overloaded methods can have different return types
//Overloaded methods must have different parameters

//Same method has been declared in same class with different or same access modifier but different parameters is called Method Overloading

/*Differences between overloading and Overriding
* Overloading|Overriding
* ===========|==========
* Occurs within one class | Occurs in 2 classes: Super class and sub class ie. inheritence is involved.
* Name of the method is same but different parameters | Name and parameters both are same
* Purpose: Increases the readability of program | Purpose: Use the method in Child class which is already present in Parent class
* Return type can be same or different | Return type is always same
* It is an example of Compile Time Polymorphism | It is an example of Run Time Polymorphism
*/
