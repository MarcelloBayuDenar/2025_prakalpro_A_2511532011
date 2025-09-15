package pekan2;

import java.util.Scanner;

public class tugasAlproPekan2 {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Masukkan Nim, Nama, Umur, IPK");
		
		String Nim = myInput.nextLine();
		String Nama = myInput.nextLine();
		
		int Umur = myInput.nextInt();
		double IPK = myInput.nextDouble();
		
		System.out.println("=== Data Mahasiswa ===");
		System.out.println("NIM  :" + " " +Nim);
		System.out.println("Nama :" + " " + Nama);
		System.out.println("Umur :" + " " + Umur + " " +  "Tahun");
		System.out.println("IPK  :" + " " + IPK);
		
		System.out.println();
		
		String UmurStr = Integer.toString(Umur);
		System.out.println("Umur (String):" + " " + UmurStr);
		
		
		long NimAngka = Long.parseLong(Nim);
		long Hasil = NimAngka + Umur;
		System.out.println("NIM + Umur   :" + " " + Hasil );
		

	}

}
