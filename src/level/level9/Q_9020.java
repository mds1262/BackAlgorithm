package level.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 자연수 n이 짝수 일경 소수의 합 구하기
 * @author deuksoomoon
 * 범위 4 ≤ n ≤ 10,000
 * 조건
 * 1.자연수 n은 짝수여야한다
 * 2.자연수 n은 소수끼리 합하여 자연수 n이 나와야한다
 * 3.만약 소수끼리의 합이 여러종류일경우 각각의 소수의 차가 작은경우를 선정
 */
public class Q_9020 {
	static boolean[] arr = getPrimes();

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
				
		for(int i = 0; i < T; i++) {
			int n = scan.nextInt();
			
			printPrimes(n);
			
		}
		
		scan.close();
		
	}
	
	/**
	 * 최소 4부터 시작하기 때문
	 * 소수인 0,1,2,3은소수로 미리 정의하고 처리
	 * @return
	 */
	public static boolean[] getPrimes(){
		boolean[] arr = new boolean[10001];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;
			}
			
			for(int j = i + i; j < arr.length; j += i) {
				arr[j]=true;
			}
		}
		
		return arr;
	}
	/**
	 * 자연수 n와 list에 담긴 소수와의 차를 구하여
	 * 남은 숫자가와 합이 자연수 n이 되는 경우를 찾자
	 * 두 소수의 합이 N(num)이 되는 것이므로 N(num)/2까지만 구함
     * 숫자가 커질 수록 두 수의 차이가 작아지므로 i의 최대 값을 구함
     * https://velog.io/@yeoj1n/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-9020%EB%B2%88-%EA%B3%A8%EB%93%9C%EB%B0%94%ED%9D%90%EC%9D%98-%EC%B6%94%EC%B8%A1
	 * @param n
	 */
	public static void printPrimes(int n) {
		int minNum = 0;
		for(int i=2; i<=n/2; i++) {
			if(!arr[i] && !arr[n-i]) {
				minNum = i;
			}
		}
		System.out.println(minNum + " " + (n -minNum));
	}
}
