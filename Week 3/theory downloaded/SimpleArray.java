package week03.theory;

public class SimpleArray {
    public static void main(String[] args) {
        // Array Declaration
        // DATATYPE[] arrayName = new DATATYPE[size]
        double[] myList = new double[10];
        // OR
        double[] myList2;
        myList2 = new double[10];
        // There is 10 empty slot in array myList and myList2
        System.out.println(myList[3]);

        // Shorthand Array Declaration
        double[] myList3 = {1.9, 2.9, 3.4, 3.5};
        // OR manual declaration
        double[] myList4 = new double[4];
        myList4[0] = 1.9;
        myList4[1] = 2.9;
        myList4[2] = 3.4;
        myList4[3] = 3.5;

        // Char Array
        char[] city = {'T', 'a', 'n', 'g', 'e', 'r', 'a', 'n', 'g'};
        System.out.println(city);
        System.out.println(city[3]);

        // String Array
        String[] name = {"Andre", "Bunga", "Christine", "Donny"};
        System.out.println(name[0]);
    }
}
