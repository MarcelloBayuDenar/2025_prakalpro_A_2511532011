package Pekan7_2511532011;

import java.util.Scanner;

public class BilanganPrima_2511532011 {
	
		public static boolean isPrime(int n) {
			int factor = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					factor++;
				}
			}
			return (factor == 2);
		}
		
		public static void main (String [] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("input nilai n =");
			int a = input.nextInt();
			if (isPrime(a)) {
				System.out.println(a + " " + "bilangan prima");
			} else {
				System.out.println(a + " " + "bukan bilangan prima");
			}
		}
}
