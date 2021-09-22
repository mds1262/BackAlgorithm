package level.level7;

import java.util.Arrays;
import java.util.Scanner;

public class TotalNumberSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String strNumber = scan.next();
		String[] numbers = strNumber.split("");
		

		scan.close();
		
		int sum = Arrays.stream(numbers).mapToInt(x -> Integer.parseInt(x)).sum();
		System.out.println(sum);

	}
}
