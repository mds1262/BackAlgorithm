package level.level9;

import java.util.Scanner;

/**
 * 자연수 n보다 크고 2n보다 작거나 같은 범위의 소수구하기
 * n의 최대 범위는 123,456이
 * @author deuksoomoon
 * 먼저 123,456 * 2의 소수을 먼저 구하기
 * 입력된 자연수 n의 기준에 해당하는 배열번호가 소수일경우만 체크 
 * TIP
 * 소수를 구하기위해서는 "에라토스테네스의 체"을 이용해야한다
 * Line 47번 Method을 확인
 */
public class Q_4948 {

	public static boolean[] primeArr = new boolean[246913];
	
	public static void main(String[] args) {
		findPrimes();
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			
			if (n == 0) {
				break;
			}
			
			int cnt = 0;
			
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!primeArr[i]) {
					cnt++;
					continue;
				}
			}
			
			System.out.println(cnt);
		}
		
		scan.close();
	}

	/**
	 * 에라토스테네스의 체
	 * "소수가 되는 수의 배수를 지우면 남은 건 소수가 된다"
	 * n 개중에 소수를 구할때
	 * 1. n 개 만큼 배열을 만든다. 
	 * 2. 그 배열에서 0 , 1 은 소수가 아니기 때문에 제외
	 * 3. 2 부터 제곱 근 만큼 나누었을떄 0 이라면 true 로 반환
	 * 소수 판별시 제곱근을 사용하는 이유는 해당 제곱근의 
	 * 보다 작은 소수의 배수들은 모두 소수가 아니기때문에 
	 * 해당 소수의 배수들을 제외시키기 위해서이다
	 * 참고 링크
	 * https://mygumi.tistory.com/66
	 */
	// 소수찾기
	public static void findPrimes() {
		// 배열은 0부터 시작이고 1은 소수가 아니므로 true
		primeArr[0] = primeArr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(primeArr.length); i++) {
			if(primeArr[i]) {
				continue;
			}

			for(int j = i + i; j < primeArr.length; j += i) {
				primeArr[j] = true;
			}
		}
	}

}
