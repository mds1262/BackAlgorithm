package level.level8;

import java.util.Scanner;

public class ASNAJump {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i = 0;i < N;i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int d = y - x;
			System.out.println(move(d)); 
		}
		scan.close();
	}

	private static int move(int d) {
		long max = 0;
		int i;
		for(i = 1; max < d; i++) {
			max += (i + 1) / 2;
			System.out.println(d + "  :  " + i + "  :  "  + max);
		}
		return i - 1;
	}
}
