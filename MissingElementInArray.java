package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// Here is the input
		//int[] arr = {1,2,3,4,7,6,8};
		
		
		List<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(6);
		num.add(8);
		
		System.out.println("The Given list order is: " + num);
		
		Collections.sort(num);
		
		System.out.println("The sorted list order is: " + num);
		
		for (int i = 0; i < num.size()-1; i++) {

			if (i + 1 != num.get(i)) {

				// check if the iterator variable is not equal to the array values respectively

				// print the number
				System.out.println(i + 1);
				break;
			}

			// once printed break the iteration

		}

	}
}