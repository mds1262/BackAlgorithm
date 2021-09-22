package level.level7;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author deuksoomoon
 * 공백을 기준으로 단어를 분리하는 StringTokenizer을 사용
 */

public class WordCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.nextLine();

		S = S.trim();

		scan.close();

		S.toLowerCase();
		
		StringTokenizer st = new StringTokenizer(S);
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		
		System.out.println(cnt);

	}
}


