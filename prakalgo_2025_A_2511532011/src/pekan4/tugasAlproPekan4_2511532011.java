package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532011 {
	public static void main(String[] args) {
		String name;
		int harga = 50000;
		int tiket, hari, waktu,  studio;
		double hasil1 = 0, hasil2 = 0;
		double hargaPer, subtotal, total, diskon;
		String D = "", T = "", J ="";
		
		String[] namaWaktu = {" ", "pagi", "siang", "malam"};
		String[] namaHari  = {" ", "senin-kamis", "jumat", "sabtu-minggu"};
		String[] jenisStudio = {" ", "Regular", "Deluxe", "Premium" };
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan Nama: ");
		name = input.nextLine();
		System.out.print("masukkan jumlah tiket: ");
		tiket = input.nextInt();
		System.out.print("masukkan hari: ");
		hari = input.nextInt();
		System.out.print("masukkan waktu tayang: ");
		waktu = input.nextInt();
		System.out.print("masukkan jenis studio: ");
		studio = input.nextInt();
		
		switch (hari) {
		case 1:
			D = namaHari[hari];
			break;
			
		case 2:
			D = namaHari[hari];
			break;
			
		case 3:
			D = namaHari[hari];
			break;
	
		default:
			System.out.println("Tidak ditemukan");
			return;
		}
		
		switch (waktu) {
		case 1: 
			T = namaWaktu[waktu];
			break;
		case 2:
			T = namaWaktu[waktu];
			break;
		case 3:
			T = namaWaktu[waktu];
			break;
		default:
			System.out.println("Tidak ditemukan");
			return;
	}
		
		switch (studio) {
			case 1: 
				J = jenisStudio[studio];
				break;
			case 2: 
				J = jenisStudio[studio];
				break;
			case 3: 
				J = jenisStudio[studio];
				break;
			default:
				System.out.println("Tidak ditemukan");
				return;
			
		}
		
		input.close();
		
		hasil1 = harga * 0.3 ;
		hasil2 = harga * 0.2;
		hargaPer = harga + hasil1 + hasil2;
		subtotal = hargaPer * tiket;
		diskon = subtotal * 0.2;
		total = subtotal - diskon;
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("=============PEMBELIAN TIKET BIOSKOP=============");
		System.out.println("Nama Pembeli  :" + " " + name);
		System.out.println("Jumlah Tiket  :" + " " + tiket);
		System.out.println("Hari          :" + " " +  D);
		System.out.println("Waktu Tayang  :" + " " +  T);
		System.out.println("Jenis Studio  :" + " " +  J);
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Harga Dasar   :" + " " + "Rp" + harga + "/tiket");
		System.out.println("Biaya Hari    :" + " " + "+" + "30% --> Rp" + hasil1 );
		System.out.println("Biaya Waktu   :" + " " + "+" + "20% --> Rp" + hasil2);
		System.out.println("Harga perTiket:" + " " + "Rp" + hargaPer);
		System.out.println("Subtotal      :" + " " + "Rp" + subtotal);
		System.out.println("Diskon(20%)   :" + " " + "Rp" + diskon);
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Total Bayar   :" + " " + "Rp" + total);
		
	}

}
