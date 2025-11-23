package pekan8_2511532011;

import java.util.Scanner;

public class tugasFuction_2511532011 {
	
	public static int jumlahGanjil(int x) {
		int y = 0;
		for (int i = 0; i <= x; i++) {
			if (i%2 == 1) {
				y +=  i;
			
			} else {
				continue;
			}
		}
		return y;
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("inputkan angka:");
		int z = input.nextInt();
		System.out.println(jumlahGanjil(z));
	}

}
