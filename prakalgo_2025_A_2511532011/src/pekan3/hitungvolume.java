package pekan3;
import java.util.Scanner;
public class hitungvolume { // mencari volume tabung
	public static void main(String[] args) {
		final double pi = 3.14;
		int r;
		int t;
		double hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("masukkan nilai jari-jari: ");
		r = keyboard.nextInt();
		System.out.print("masukkan nilai tinggi: ");
		t = keyboard.nextInt();
		keyboard.close();
		hasil = pi * r * r * t;
		System.out.println("Volume Tabung :" + hasil);
	}

}
