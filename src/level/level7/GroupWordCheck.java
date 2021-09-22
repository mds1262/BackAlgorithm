package level.level7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author deuksoomoon
 * 동일한 문자가 연속적으로 나오지 않는경우를 제외한 단어 찾기
 * 특정단어들을 Check 하기위해서는 a-z을 char로 지정
 * char을 int로 변경하면 int값이 있다
 * a-z는 총 26개가 있으며, 최초 Default 을 'a'을 기준으로 시작
 * 이전 알파벳을빼면 해당 Array의 buffer 자리에 boolean으로 채워진다
 * a는 97이며 그숫자 위로 증가된다
 */
public class GroupWordCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String word = scan.next();
			if(checker(word)) {
				cnt += 1;
			}
		}

		scan.close();
		
		System.out.println(cnt);

	}

	public static boolean checker(String str) {
		boolean[] check = new boolean[26];
		int p = 0;

		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i); 
			
			if (p != n) {

				if (check[n - 'a'] == false) {
					check[n - 'a'] = true;
					p = n;
				}

				else {
					return false;
				}
			}

			else {
				continue;
			}
		}
		return true;
	}
}
