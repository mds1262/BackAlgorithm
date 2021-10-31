package level.level8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author deuksoomoon 행렬에서 특정행 X와 특정열 y의 값 찾기 최초 1행의 y행까지는 1씩 등차수열이 존재 x행의 y열의
 *         값은 x-1행 y열까지의 합이 x행의 y열의 값 결국 x행의 y열의 값은 x-1행 y열 + x행 y-1열 = x행y열
 */
public class BossPick {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		List<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			r.add(getNum(k, n));
		}

		scan.close();
		
		for(int n : r) {
			System.out.println(n);
		}
	}

	static int getNum(int k, int n) {
		List<List<Integer>> cross = new ArrayList<List<Integer>>();

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i <= k; i++) {
			int sum = 0;
			if (i == 0) {
				for (int j = 0; j < n; j++) {
					result.add(j + 1);
				}
				cross.add(result);
				continue;
			}

			result = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				sum += cross.get(i - 1).get(j);
				result.add(sum);
			}

			cross.add(result);
		}

		return cross.get(k).get(n - 1);
	}

}
