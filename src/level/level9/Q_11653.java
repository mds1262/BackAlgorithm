package level.level9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소인수분해
 * 
 * @author deuksoomoon 소인수 => 1와 자기 자신만 가진 인수 소운수 분해 => 어떠한 정수를 소인수로 나누어 분해한것 약수
 *         => 인수, 어떠한 정수를 나머지 없이 나눌 수 있는 정수들의 집합 ex)9의 약수 = 1, 3, 9
 */
public class Q_11653 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		List<Integer> result = getPrimeFracrorization(num);

		if (result.size() == 0) {
			System.out.println("");
		} else {

			for (int r : result) {
				System.out.println(r);
			}
		}
		scan.close();
	}

	public static List<Integer> getPrimeFracrorization(int num) {
		List<Integer> result = new ArrayList<Integer>();

		int val = num;
		int divnum = 2;
		while (val != 1) {
			if (val % divnum > 0) {
				divnum += 1;
				continue;
			}
			val = val / divnum;
			result.add(divnum);
			divnum = 2;
		}

		return result;
	}
}
