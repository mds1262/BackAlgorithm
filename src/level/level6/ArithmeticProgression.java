package level.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author deuksoomoon
 * (주어진수 자리수 * 10 을 나누면 해당 몫은 첫재짜리 숫자) % ((주어진수 - 구하고자하는 자리위치 ) *10)
 * ex) 4111
 * 첫자리 4111 / 10(4 - 1){제곱근} -> 4
 * 두번째 (4111 / (10(4 - 2){제곱근})) % 100 -> 1
 * 세번째 (4111 / (10(4 - 3){제곱근})) % 10 -> 1
 * 네번째 4111 / (10(4 - 4){제곱근})) % 10 -> 1
 * abc a - b = d
 * d = b - c
 * 등차수열은 100 미만은 모두 등차수열이다
 * 100이상부터 검사
 * 
 */

public class ArithmeticProgression {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(Count(N));
		
		br.close();
	}

	private static int Count(int N) {
		
		int cnt = 0;
		
		if(N<100) {
			return N;
		} else {
			cnt = 99;
			
			for(int i=100; i<=N; i++) {
				
				int A = i / 100;
				int B = (i / 10) % 10;
				int C = i % 10;
				
				if(B-A == C-B) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
