/**
 * 
 */
package javaProgramsforQA;

import java.util.HashSet;




public class Qu73_DuplicateNumberBetween1ToN {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,6,1};//Create an array with integer values containing duplicates. This data remains the same for both approaches.
		//int arr[]= {1,2,3,4,6,7};//An array with integer values and no duplicates. This data is used just to test the if condition for no duplicates.
		
		//https://www.youtube.com/watch?v=X_NfqtyG4Bs
		
		//Logic 1-Comparing each element with all other elements of the array one by one.
		
		/*boolean flag=false;//Initializing boolean object flag to false that will flag the output according to it's value after the execution
		for (int i=0;i<arr.length;i++) {//First "for" loop to assign first element
			
			for (int j=i+1;j<arr.length;j++) {//Second "for" loop to assign next element for comparison with first element
				if (arr[i]==arr[j]) {//if condition for comparison of values in arr[i] and arr[j] one by one till a match is found
					System.out.println("Found duplicate element: "+arr[i]);
					flag=true;//Boolean object flag value has been changed to true
				}
				
			}
		}
		if (flag==false) {//In case there are not duplicates found, flag value remains false
			System.out.println("Duplicate element not found");
		}*/
		
		
		
		//Logic 2-Using HashSet data structure/java collection
		
		
		HashSet <Integer> values=new HashSet<Integer>();//HashSet of type Integer has been initialized
		
		/*HashSet Demo Code:
		 * System.out.println(values.add(1));
		 * System.out.println(values.add(2));
		 * System.out.println(values.add(1));
		*Running till here will return boolean values following boolean values as output:
		true
		true
		false--->Adding duplicate value will return false and that duplicate will not be added to the HashSet.
		This is the behavior/feature of HashSet collection
		So, in approach 2 we will use this feature of hashset to find duplicate values in an array.
		*/

		boolean flag=false;
		for (int i:arr) {//Assigning values of array one by one to for loop
			if(values.add(i)==false){//Adding values one by one to hash map till we get a false for duplicate value
				System.out.println("Found Duplicate Element:"+i);
				flag=true;
			}
		}
		if (flag==false) {
			System.out.println("Duplicates not found");
		}
		

	}

}
