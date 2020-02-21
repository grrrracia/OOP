package week03.theory;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 9, 2, 1, 4, 5, 11, 12, 40, 22, 0};
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total += nums[i];
        }
        System.out.println("Total: " + total);
    }
}
