package pekan2;

import java.util.Scanner;

public class tugasAlproPekan2 {
	public static void main(String[] args) {
		
		int JumlahStokKendaraanRoda2; 
		float HargaKendaraan; 
		char JenisKendaraanRoda2; 
		boolean StatusStokJenisKendaraan ;  /* true = stok ada, false = stok habis */
		
		Scanner myInput = new Scanner(System.in);
		 
		System.out.println("Masukkan Jumlah Stok Kendaraan Roda2 ");
		JumlahStokKendaraanRoda2 = myInput.nextInt();
		System.out.println("Masukkan Harga Kendaraan");
		HargaKendaraan = myInput.nextFloat();
		System.out.println("Masukkan Jenis Kendaraan Roda2");
		JenisKendaraanRoda2 = myInput.next().charAt(0);
		System.out.println("Masukkan Status Stok (true=ada, false=kosong)");
		StatusStokJenisKendaraan = myInput.nextBoolean();
		
		System.out.println("=== Data Stok Kendaraan Roda 2 ===");
		System.out.println("Jumlah Stok  :" + " " + JumlahStokKendaraanRoda2 + " "+ "buah");
		System.out.println("Harga        :" + " " + "Rp" + " " + HargaKendaraan);
		System.out.println("Jenis        :" + " " + JenisKendaraanRoda2);
		System.out.println("Status stok  :" + " " + StatusStokJenisKendaraan);
		System.out.println("Jika Ada Pertanyaan Lebih Lanjut Silahkan Hubungi No");
		System.out.println("08xx-xxxx-xxxx");
		
	}

}
