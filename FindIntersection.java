package week3.day2Assignments;

import java.util.LinkedList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
	
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	List<Integer> num1= new LinkedList<>();
	num1.add(3);
	num1.add(2);
	num1.add(11);
	num1.add(4);
	num1.add(6);
	num1.add(7);
	System.out.println("The First List is : "+num1);
	
	List<Integer> num2= new LinkedList<>();
	num2.add(1);
	num2.add(2);
	num2.add(8);
	num2.add(4);
	num2.add(9);
	num2.add(7);
	System.out.println("The Second List is : "+num2);
	
	System.out.println("The Intersection values are: ");
	
	for (int i = 0; i < num1.size(); i++) {
		for (int j = 0; j < num2.size(); j++) {
			
			if((num1.get(i)) == (num2.get(j)))
			{
				//System.out.print(" "+num1.get(i));
				System.out.println(""+num2.get(j));
			}
		}
	}
	
}
}
	
	


