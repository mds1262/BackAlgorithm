package level.level8;

import java.util.Scanner;
/**
 * 
 * @author deuksoomoon
 * 등차수열이 적용된문제
 * 대각선으로 1, 2, 3, 4 갯수가 있었음
 * 해당 들어오는 숫자가 어떤 대각선의 갯수에 포함이 되는지 확인이 필요
 * 해당 대각선 번호를 바탕으로 대각선번호를 부모로 생각하고 들어온수와 합의 나머지로
 * 부모수를 줄이고 분자의 숫자을 올려서 계산
 * 짝수일경우 부모가 위에 홀수일경우 부모 아래
 */
public class FindFraction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();

		scan.close();

		int groupNum = 1;
		int sum = 0;
		while (true) {
			sum += (groupNum - 1) + 1;
			if (sum >= X) {
				break;
			}
			groupNum += 1;
		}

		int idx = sum % X;

		int ja = 1;
		int mo = groupNum + 0;
		for (int i = 0; i < idx; i++) {
			mo -= 1;
			ja += 1;
		}

		String result = "";
		if (groupNum % 2 == 0) {
			result = String.format("%s/%s", String.valueOf(mo), String.valueOf(ja));
		} else {
			result = String.format("%s/%s", String.valueOf(ja), String.valueOf(mo));
		}

		System.out.println(result);
	}
}
