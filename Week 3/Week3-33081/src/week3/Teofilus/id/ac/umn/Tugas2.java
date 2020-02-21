package week3.Teofilus.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilih,mulai,akhir;
		String nama,cont,cont2;
		String pilihan[] = {
			"charAt",
			"length",
			"substring(n)",
			"substring(m,n)",
			"contains",
			"concat",
			"replace",
			"split",
			"lowerCase",
			"upperCase"
		};

		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();

		System.out.println("--------------------");
		System.out.println("String anda : "+nama);
		for(int i=0; i<pilihan.length; i++){
			System.out.printf("%d. %-24s%d. %s\n", i+1, pilihan[i], i+2, pilihan[i+1]);
			i++;
		}
		System.out.print("Pilih menu : ");
		pilih = input.nextInt();

		System.out.println("\n-----"+pilihan[pilih-1]+"-----");
		switch(pilih)
		{
			case 1 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : ");
				mulai = input.nextInt();
				System.out.println("hasil : "+nama.charAt(mulai));
				break;

			case 2 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : "+nama.length());
				break;

			case 3 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : ");
				mulai = input.nextInt();
				System.out.println("hasil : "+nama.substring(mulai));
				break;

			case 4 :
				System.out.println("Nama : "+nama);
				System.out.print("Input mulai : ");
				mulai = input.nextInt();
				System.out.print("Input akhir : ");
				akhir = input.nextInt();
				System.out.println("hasil : "+nama.substring(mulai,akhir));
				break;

			case 5 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : ");
				input.nextLine();
				cont = input.nextLine();
				System.out.println("hasil : "+nama.contains(cont));
				break;

			case 6 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : ");
				input.nextLine();
				cont = input.nextLine();
				System.out.println("hasil : " +nama.concat(cont));
				break;

			case 7 :
				System.out.println("Nama : "+nama);
				System.out.print("Input Kata yang diganti : ");
				input.nextLine();
				cont = input.nextLine();
				System.out.print("Input Kata pengganti : ");
				cont2 = input.nextLine();
				System.out.println("hasil : " +nama.replace(cont, cont2));
				break;

			case 8 :
				System.out.println("Nama : "+nama);
				System.out.print("Input : ");
				input.nextLine();
				cont = input.nextLine();
				for(String w:nama.split(cont))
				{
					System.out.println("hasil : "+w);
				}
				break;
				
			case 9 :
				System.out.println("Nama : "+nama);
				System.out.println("hasil : "+nama.toLowerCase());
				break;
				
			case 10 :
				System.out.println("Nama : "+nama);
				System.out.println("hasil : "+nama.toUpperCase());
				break;
		}
		input.close();
	}
}
