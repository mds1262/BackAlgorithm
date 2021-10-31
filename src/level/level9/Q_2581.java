package level.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소수를 찾는 문제
 * @author deuksoomoon
 * M이상 N이하 소수의 합 및 최솟값 구하기
 */
public class Q_2581 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int M = scan.nextInt(), N =scan.nextInt();
		
		scan.close();
		
		List<Integer> l = new ArrayList<Integer>();
		for(int i = M; i <= N; i ++) {
			if(primeSumAndMin(i)) {
				l.add(i);
				continue;
			}
		}
		
		if(l.size() == 0) {
			System.out.println(-1);
			return;
		}
		
		int sum = l.stream().mapToInt(i -> i).sum();
		
		System.out.println(sum);
		System.out.println(l.get(0));
		
		
		
	}
	
	public static boolean primeSumAndMin(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
