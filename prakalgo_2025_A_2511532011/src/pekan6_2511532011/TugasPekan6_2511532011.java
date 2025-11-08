package pekan6_2511532011;

import java.util.Scanner;
import java.util.Random;

public class TugasPekan6_2511532011 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		int tries = 0;
		boolean berjalan = true;
		
		System.out.println("Permainan Lempar dadu ( permainan akan berhenti jika penjumlahan 2 dadu nilainya = 7 ) ");
	
		 while(berjalan) {
			tries++;
			int hasil = play(input, acak);
			if (hasil == 1 ) { 
				System.out.println("Anda menang setelah" + " " + tries + " " + "percobaan!");
				break;
			} else if ( hasil == 2) {
				System.out.println("Anda Gagal Menang");
				break;
			} 
		}
		 input.close();
	}
	
	public static int play (Scanner input, Random acak) {
		String jawab;
		int guess;
		int op1 = acak.nextInt(4) + 2;
		int op2 = acak.nextInt(4) + 2;
		int jmlh = op1 + op2;
		
		System.out.print(op1 + " + " + op2 + " = ");
		
		guess = input.nextInt();
		input.nextLine();
		
		
		if (guess == 7 ) {
			System.out.println("Tebakkan Anda Benar");
			return 1;
		} else if (guess == jmlh ) {
			System.out.println("Tebakkan Anda Benar");
		} else if (guess != jmlh) {
			System.out.println("Tebakkan Anda Salah");
		}
	
		System.out.print("Apakah Anda Ingin Lempar Dadu (ya / tidak): ");
		jawab = input.nextLine().trim();
		
		if (jawab.equalsIgnoreCase("tidak")) {
			return 2;
		} 
		
		return 0;
		
  }
}
