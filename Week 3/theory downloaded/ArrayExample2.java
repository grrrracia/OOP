package week03.theory;

public class ArrayExample2 {
    public static void main(String[] args) {
        // Searching the biggest number
        int[] nums = {5, 6, 9, 2, 1, 4, 5, 11, 12, 40, 22, 0};
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
        	//anything.length : finds the number of data inside an array
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Max Num: " + max);
    }
}
