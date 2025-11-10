package Pekan7_2511532011;

import java.util.Scanner;

public class PanggilMahasiswa2_2511532011 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		String X = input.nextLine();
		System.out.print("NAMA: ");
		String Y = input.nextLine();
		Mahasiswa_2511532011 a = new Mahasiswa_2511532011();
		a.setNim2(X);
		a.setNama(Y);
		
		if(X.startsWith("25")) {
			System.out.println(Y + " anda angkatan 2025");
		} 
		if(X.contains("1153")) {
			System.out.println(" anda mahasiswa Informatika");
		}
		a.cetak2();
		input.close();
		
	}
}
