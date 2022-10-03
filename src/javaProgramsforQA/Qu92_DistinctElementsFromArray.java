package javaProgramsforQA;

public class Qu92_DistinctElementsFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,1,2,3};
		int count=0;
		
		
		for (int i=0;i<a.length;i++) {
			boolean notDistinct=false;//boolean flag used to signal distinct values
			for (int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					notDistinct=true;//for non-distinct element set the flag to true and break the loop
					break;
				}
			
			//To print distinct elements in same order as in array we should apply for loop for integer j as below
			/*for (int j=0;j<i;j++) {
				if (a[i]==a[j]) {
					notDistinct=true;//for non-distinct element set the flag to true and break the loop
					break;
				}*/
				
				
			}
			if (!notDistinct) {//If not distinct remains false
				
				count++;
				System.out.print(a[i]+" ");
		}
		
		
		}
		System.out.print("are the distinct elements in this array. In total there are "+count+" distinct values.");

	}

}
