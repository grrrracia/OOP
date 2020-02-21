package week02.gracia.id.ac.umn;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		int number;
		int flag = 0;
		int i;
		int check1 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		number = scanner.nextInt();
		
		check1 = number/2;
		
		if(number == 0 || number == 1) {
			System.out.println(number+" is not a prime number");
		}
		else {
			for(i = 2; i <= check1; i++) {
				if (number%i == 0) {
					System.out.println(number+" is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number+" is a prime number");
			}
		}
		
	}

}
