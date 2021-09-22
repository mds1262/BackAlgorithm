package level.level8;

import java.util.Scanner;

public class Honeycomb {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		if (N == 1) {
			System.out.println(1);

		} else {

			N = N - 1;
			scan.close();

			int i = 0;
			int cnt = 0;

			while (N > 0) {
				N -= (i * 6);
				i += 1;
				cnt += 1;
			}

			System.out.println(cnt);
		}
	}
}
