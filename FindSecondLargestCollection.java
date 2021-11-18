package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollection {
	
	public static void main(String[] args) {
		//// Here is the input
		// int[] data = {3,2,11,4,6,7};
		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

		// int[] data = {3,2,11,4,6,7};

		List<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		System.out.println("The Given list order is: " + num);

		int len = num.size();
		
		System.out.println("The Length of the given list is: " + len);

		Collections.sort(num);
		System.out.println("List values arranged in Ascending order" + num);
		
		int len1 = num.get(num.size() - 2);

		System.out.println("The Second largest number in list is: " + len1);

	}

}