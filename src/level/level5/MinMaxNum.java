package level.level5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i ++) {
			int num = scan.nextInt();
			nums[i] = num;
		}
		
		scan.close();
		
		int min = Arrays.stream(nums).boxed().mapToInt(i -> i).min().getAsInt();
		int max = Arrays.stream(nums).boxed().mapToInt(i -> i).max().getAsInt();
		
		System.out.println(min + " " +max);
	}
}
