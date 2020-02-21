package week3.theory;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Challenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<Double> gpa = new ArrayList<Double>();
		int index = 0;
		ArrayList<String> studentListing = new ArrayList<String>();
		
		do {
			System.out.println("Welcome to the Student Database System");
			System.out.println("1. Input Student");
			System.out.println("2. Display Students (Sort by Name)");

			System.out.println("Choose: ");
			choose = input.nextInt();
			
			if(choose == 1) {
				System.out.print("Student Name: ");
				students.add(input.next());
				System.out.print("GPA: ");
				gpa.add(input.nextDouble());
				index++;
			}
			
			if (choose == 2) {
				System.out.println("Student List:\n");
				for (int i = 0; i<students.size(); i++) {
					String data = students.get(i);
					data = data.concat(" ");
					data = data.concat(Double.toString(gpa.get(i)));
					studentListing.add(data);
			}
				for (int i = 0; i<studentListing.size(); i++) {
				Collections.sort(studentListing);
				System.out.println(studentListing.get(i));
				}
			}
		}while (true);
	}

}
