package week3.theory;

public class Array2D {
    public static void main(String[] args) {
        // [row][col]
        int[][] matrix = new int[3][3];
        int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 1 2 3
        // 4 5 6
        // 7 8 9
        System.out.println(matrix2[2][1]);

        for(int row=0; row<3; row++) {
            for(int col=0; col<3; col++) {
                System.out.printf("%2d ", matrix2[row][col]);
            }
            System.out.println();
        }
    }
}
