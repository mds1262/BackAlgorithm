package level.level9;

import java.util.Scanner;

/**
 * 소수를 판별하기
 * @author deuksoomoon
 * 소수는 1을 초과하는 숫자들로
 * 1와 자신만이 나눠지는 숫자
 *
 */
public class Q_1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int result = 0;
		
		for(int i=0; i < N; i++) {
			int num = scan.nextInt();
			if(checkPrime(num)) {
				result++;
				continue;
			}
		}
		
		scan.close();
		
		System.out.println(result);
		
		
	}
	
	public static boolean checkPrime(int num) {
		boolean isPrime = true;
		
		if(num > 1) {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime =  false;
					break;
				}
			}
		}else {
			isPrime = false;
		}
	
		return isPrime;
	}
}
