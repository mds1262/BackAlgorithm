package level.level5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
		int[] nums = new int[9];
		
		for(int i = 0; i < 9; i ++) {
			int num = scan.nextInt();
			nums[i] = num;
		}
		
		scan.close();
		
		int max = Arrays.stream(nums).max().getAsInt();
		System.out.println(max);

		int idx = Arrays.stream(nums).boxed().collect(Collectors.toList()).lastIndexOf(max);
		
		System.out.println(idx);
	}
}
