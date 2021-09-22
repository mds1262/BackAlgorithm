package level.level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		List<String> l = new ArrayList<String>();

		for (int i = 0; i < T; i++) {
			int R = scan.nextInt();
			String S = scan.next();
			String[] SArr = S.split("");

			String result = Arrays.stream(SArr).map(x -> {
				String r = "";
				for(int j = 0; j < R; j++) {
					r = r + x;
				}
				return r;
			}).reduce("", (a, b) -> a + b);
			l.add(result);
		}
		
		scan.close();
		
		for(String s : l) {
			System.out.println(s);
		}
	}
}
