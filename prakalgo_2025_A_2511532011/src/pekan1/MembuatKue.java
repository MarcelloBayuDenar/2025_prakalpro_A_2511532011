package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeButter();
		memanggang();
		memanggang();
		menghias();
		
	}
	
	//Langkah 1: siapkan adonan
	public static void makeButter() {
		System.out.println("campur bahan kering.");
		System.out.println("Krim mentega dan gula.");
		System.out.println("Kocok telurnya.");
		System.out.println("Masukkan bahan kering.");
	}
	// Langkah 2: Panggang sekumpulan kue
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengatur waktu.");
		System.out.println("Masukkan kue ke dalam oven.");
		System.out.println("Biarkan cookieuntuk dipanggang.");
	}
	//Langkah 3: Hiasi cookie.
	public static void menghias () {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting untuk dan taburan.");
	}
}
