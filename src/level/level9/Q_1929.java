package level.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소수구하기
 * @author deuksoomoon
 *  M이상 N이하의 소수 찾기
 *  최대숫자까지 소수을 모두 구하
 *  거기서 해당 되는 범위의 소수들을 찾는 방식으로 접근
 *  해당 문제를 접근하기위해서는 
 *  에라토스테네스의 체 라는 방식을 사용해야됨
 *  1. 배열을 생성하여 초기화한다.
 *  2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.(해당 배수들은 이미 소수의 기준을 충족하지 못하기 때문에 제거해야)
 *  3. 2부터 시작하여 남아있는 수를 모두 출력한다.
 */
public class Q_1929 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int M = scan.nextInt();
		int N = scan.nextInt();
		
		
		List<Integer> primeList = new ArrayList<Integer>();
		
		boolean [] primes = getPrimes(N);
		for(int i = M; i <= N; i++) {
			if (!primes[i]) {
				primeList.add(i);
			}
		}
		
		scan.close();
		
		for(int p : primeList) {
			System.out.println(p);
		}
	}
	
	public static boolean[] getPrimes(int max){
		boolean [] primes = new boolean[max+1];
		primes[1]=true;
		
		for(int i = 2; i <= max; i++) {
			for(int j = 2; i*j < primes.length; j++) {
				primes[i*j] = true;
            }
		}
		
		return primes;
	}
}
