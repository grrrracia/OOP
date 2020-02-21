package week02.gracia.id.ac.umn;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
			int minimum, maximum;
			int flag = 0;
			int i, count;
			int check1 = 0;
			int sum = 0;
				
			Scanner scanner = new Scanner(System.in);
				
			System.out.print("Enter the Smallest Number: ");
			minimum = scanner.nextInt();
			
			System.out.print("Enter the Largest Number: ");
			maximum = scanner.nextInt();
			
			count = minimum;
			
			while (count <= maximum) {
				flag = 0;
				check1 = count/2;
				
				if(count == 0) {
					flag = 1;
				}
				
				if(count == 1) {
					flag = 1;
				}
				
				else {
					for(i = 2; i <= check1; i++) {
						if (count%i == 0) {
							flag = 1;
							break;
						}
					}
				}
				if (flag == 0) {
					sum = sum + count;
				}
				count = count + 1;
			}
			System.out.print("The Sum of All Prime Values from " +minimum);
			System.out.print(" to " +maximum);
			System.out.print(" is " +sum);

		}

}
