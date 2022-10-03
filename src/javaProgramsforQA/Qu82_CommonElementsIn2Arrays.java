package javaProgramsforQA;

import java.util.HashSet;
import java.util.Set;

public class Qu82_CommonElementsIn2Arrays {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5, };//Array 1
		int a2[]= {1, 6,7,8,9,0, };//Array 2
		Set<Integer> set=new HashSet<>();//A hashset object has been defined to save duplicate values of both arrays
		
		for (int i=0;i<a1.length;i++) {//For loop for first array
			
			for (int j=0;j<a2.length;j++) {//For loop for second array
				
				if (a1[i]==a2[j]) {//Comparison operation for each elements of both arrays
					
					set.add(a1[i]);//Add all common values to HashSet "set"				
				}		
				
			}
			
		}
		
		if (set.isEmpty()) {//Calling isEmpty() method of HashSet class in case there are no common element in both arrays
			System.out.println("No common element in both sets");
			
		}
		else System.out.println("Common elements in both arrays are "+set);//Print the common elements stored in hashset "set" 

	}

}
