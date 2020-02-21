package week3.theory;

public class Array3D {
    public static void main(String[] args) {
        char[][][] matrix = {
                {{'A','B','C'}, {'D','E','F'}, {'G','H','I'}},
                {{'J','K','L'}, {'M','N','O'}, {'P','Q','R'}},
                {{'S','T','U'}, {'V','W','X'}, {'Y','Z','0'}}
        };
        System.out.println(matrix[0][1][2]);
    }
}
