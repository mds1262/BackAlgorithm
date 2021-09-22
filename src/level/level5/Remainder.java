package level.level5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Remainder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			nums[i] = num;
		}
		
		scan.close();
		
		List<Integer> l = Arrays.stream(nums).map(x -> {
			return x % 42;
		}).boxed().distinct().collect(Collectors.toList());
		
		System.out.println(l.size());
	}
}
