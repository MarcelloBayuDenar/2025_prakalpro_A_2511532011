package pekan5;

public class Tugaspekan5 {
	public static void main(String [] arg) {
		for ( int i = 1; i <= 5; i++  ) {
			for ( int j = 1; j <= (-1 * i + 5) ; j++) {
				System.out.print(".");
			}
			System.out.print(i);
			for (int z = 1; z <= i-1; z++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}
}
