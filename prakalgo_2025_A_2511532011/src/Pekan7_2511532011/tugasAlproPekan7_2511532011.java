package Pekan7_2511532011;

import java.util.Scanner;

public class tugasAlproPekan7_2511532011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a,b,c;
		int d;
		
		Akun x = new Akun();
				
		System.out.println("==== REGISTRASI AKUN BARU ====");
		
		System.out.print("Masukkan Username: ");
		a = input.nextLine();
		x.setName(a);
		
		System.out.print("Masukkan Password: ");
		b = input.nextLine();
		x.setPw(b);
		
		System.out.print("Masukkan Email: ");
		c = input.nextLine();
		x.setEmail(c);
		
		System.out.print("Masukkan PIN (6 digit): ");
		d = input.nextInt();
		x.setPin(d);
		
		
		if (x.isEmailValid(c) && x.isPasswordValid(b)) {
			x.cetakBerhasil();
		} else if (!x.isEmailValid(c)) {
			System.out.println("");
			System.out.println("--- REGISTRASI GAGAL ---");
			x.cetak1();
		} else if (!x.isPasswordValid(b)) {
			System.out.println("");
			System.out.println("--- REGISTRASI GAGAL ---");
			x.cetak2();
		} 
		
	}

}
