package week3.theory;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ChallengeAttempt2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		int n = 2;
			String name;
			double gpa;
		ArrayList<Student> students = new ArrayList<Student>();
		int index = 0;
		do {
			System.out.println("Welcome to the Student Database System");
			System.out.println("1. Input Student");
			System.out.println("2. Display Students (Sort by Name)");
			System.out.println("Choose: ");
			choose = input.nextInt();
			
			if(choose == 1) {
					StudentData.name = input.next();
					StudentData.gpa = input.nextDouble();
					
				System.out.print("Student Name: ");
				StudentData.name = input.next();
				System.out.print("GPA: ");
				StudentData.gpa = input.nextDouble();
				students.add(StudentData);
				index++;
			}
			
			if (choose == 2) {
				studentListings.add(studentName);
				studentListings.add(gpa);
				
				System.out.println("Student List:\n");
				Collections.sort(studentListings);
				for (int i = 0; i<studentListings.size(); i++) {
					for (int j = 0; j<studentListings.get(i).size(); j++) {
						System.out.println(studentListings.get(i).get(j) + " ");
					}
			}
		}
		}while (true);
		}
}