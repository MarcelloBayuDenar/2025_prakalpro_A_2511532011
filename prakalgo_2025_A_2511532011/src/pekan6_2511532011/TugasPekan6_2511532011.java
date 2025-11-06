package pekan6_2511532011;

import java.util.Scanner;
import java.util.Random;

public class TugasPekan6_2511532011 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		int tries = 0;
		boolean berjalan = true;
	
		 while(berjalan) {
			tries++;
			int hasil = play(input, acak);
			if (hasil == 1 ) { 
				System.out.println("Anda menang setelah" + " " + tries + " " + "percobaan!");
				break;
			} else if ( hasil == 2) {
				System.out.println("Anda Gagal Menang");
				berjalan = false;
			} 
		}
		 input.close();
	}
	
	public static int play (Scanner input, Random acak) {
		String jawab;
		int guess;
		int op1 = acak.nextInt(6) + 1;
		int op2 = acak.nextInt(6) + 1;
		int jmlh = op1 + op2;
		
		System.out.print(op1 + " + " + op2 + " = ");
		
		guess = input.nextInt();
		input.nextLine();
		
		if (guess == jmlh) {
			System.out.println("Tebakkan Anda Benar");
			return 1;
		} else {
			System.out.println("Tebakkan Anda salah");
	    }
		
		System.out.print("Apakah Anda Ingin Lempar Dadu (ya / tidak): ");
		jawab = input.nextLine().trim();
		
		if (jawab.equalsIgnoreCase("tidak")) {
			return 2;
		} else {
			return 0;
		}
  }
}
