package week3.theory;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		        int[] nums = {5, 6, 9, 2, 1, 4, 5, 11, 12, 40, 22, 0};
		        System.out.println("Before Sort");
		        for(int i : nums)
		        	System.out.print(i+ " ");
		        Arrays.sort(nums);
		        System.out.println("\nAfter Sort");
		        for(int i : nums)
		        	System.out.print(i+ " ");
		    	    }
}