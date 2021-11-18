package week3.day2Assignments;

import java.util.LinkedList;
import java.util.List;

public class PrintDuplicatesInCollection {
	
	
	public static void main(String[] args) {
		// 
		//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		// declare an int variable named count
		// iterate from 0 to the array length-1 (outer loop starts here)
			// assign 0 to count 
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
					// compare both the loop variables & check they're equal
							// increase the count if both the arrays are equal		
			// Out of the inner loop, check and print the first array variable if count is more than 0
		
		
			int[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			System.out.println("The Given Values are :");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(" "+arr1[i]);
			}
			List<Integer> list1 = new LinkedList<Integer>();
			List<Integer> list2 = new LinkedList<Integer>();
			System.out.println("\nThe Removed values are: ");
			for (int i = 0; i < arr1.length; i++) {
				if(list1.contains(arr1[i]))
				{
					list2.add(arr1[i]);
					
				}
				else
				{
					list1.add(arr1[i]);
					
				}
			}
			System.out.println("The duplicate values in list: "+list2);//Print duplicate values
			System.out.println("The unique values in list: "+list1);//Print Unique values
			
	}

}
