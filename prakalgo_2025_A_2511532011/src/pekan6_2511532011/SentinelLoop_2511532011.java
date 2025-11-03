package pekan6_2511532011;

import java.util.Scanner;

public class SentinelLoop_2511532011 {
	public static void main ( String [] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number=12; //dummy value it can be anything but 0
		
		while(number != 0) {
			System.out.print("Masukkan Angka  (0 untuk keluar ):");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("totalnya adalah " + sum);
	}
}
