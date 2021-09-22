package level.level5;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nums = 1;

		for (int i = 0; i < 3; i++) {
			int num = scan.nextInt();
			nums *= num;
		}

		scan.close();

		String[] arr = String.valueOf(nums).split("");

		Arrays.sort(arr);

		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			String strIdx = String.valueOf(i);
			for (String s : arr) {
				if(s.equals(strIdx)) {
					cnt += 1;
				}
				
			}
			System.out.println(cnt);
		}


	}
}
