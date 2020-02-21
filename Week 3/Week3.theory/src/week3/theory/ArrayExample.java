package week3.theory;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        final int numOfStudents = 4;
        double[] gpa = new double[numOfStudents];
        String[] name = {"Andre", "Bunga", "Christine", "Donny"};

        
        String[] txt = new String[5]; //make and fill array with string
        Arrays.fill(txt, "Hehe");
        
        for (String i:txt)
        	System.out.print(i);

        for(int i=0; i<numOfStudents; i++)
            gpa[i] = 4+((double)i/10);

        System.out.printf("%-10s %3s\n", "Nama", "GPA");
        for(int i=0; i<numOfStudents; i++)
            System.out.printf("%-10s %1.2f\n", name[i], gpa[i]);
        
        String[] txtCopy = new String[10];
        System.arraycopy(txt, 0, txtCopy, 0, 5); 
        //System.arraycopy(source, srcPos, destination, destPos, length); 
        //5 parameters, srcPos = the position in the array, destPos = position in the array of destination, length = how many spaces to be filled)
        for(String i:txtCopy) {
        	if(i != null)
        	System.out.println("" +i);
        	//so that the empty spaces are not printed
        }
        	
    }
}
