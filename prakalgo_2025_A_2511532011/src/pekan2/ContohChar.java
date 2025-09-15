package pekan2;

public class ContohChar {
	public static void main(String[] args) {
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka =  '7';
		char simbol = '#';
		
		System.out.println("Contoh Variabel Char:");
		System.out.println("Huruf Pertama:" + huruf1);
		System.out.println("Hurud Kedua:" + huruf2);
		System.out.println("Angka:" + angka);
		System.out.println("Simbol:" + simbol);
		
		char huruf3 = (char) (huruf1 + 1);
		System.out.println("Huruf1 + 1 =" + huruf3);
		
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("Kode ASCII dari" + huruf1 + " = " + kodeHuruf);
		System.out.println("Kode BINER dari:" + huruf1 + " = " + biner1);
		
		
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan Char menjadi string:" + kata);
		
	}

}
