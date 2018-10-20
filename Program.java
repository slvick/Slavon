package dfbljhs;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int []a = new int[x];
		int []b = new int[x];
		for (int k = 0; k < x; k++) {
			a[k] = scan.nextInt();
		}
		for (int k = x - 1; k >= 0; k--) {
			b[x - k - 1] = a[k];
		}
		for (int k = 0; k < x; k++) {
			System.out.print(b[k]);
		}
		
	}
}
:
