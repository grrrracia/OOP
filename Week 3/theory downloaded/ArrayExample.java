package week3.theory;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        final int numOfStudents = 4;
        double[] gpa = new double[numOfStudents];
        String[] name = {"Andre", "Bunga", "Christine", "Donny"};
        int [] filledIntArray = new int [10];
        Arrays.fill(filledIntArray, 7);//make and fill array with integer
        
        String[] txt = new Sring[5]; //make and fill array with string
        Arrays.fill(txt, val: "Hehe");
        
        for (String i:text)
        	System.out.print(i);

        for(int i=0; i<numOfStudents; i++)
            gpa[i] = 4+((double)i/10);

        System.out.printf("%-10s %3s\n", "Nama", "GPA");
        for(int i=0; i<numOfStudents; i++)
            System.out.printf("%-10s %1.2f\n", name[i], gpa[i]);
        
        String[] txtCopy = new String[10];
        System.arraycopy(txt, srcPos:0, txtCopy, destPos:0, length:5); 
        //5 parameters, srcPos = the position in the array, destPos = position in the array of destination, length = how many spaces to be filled)
        for(String i:txtCopy)
        	System.out.println("." +i);
    }
}
