package greed;

import java.util.Scanner;

public class CoinSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum = scan.nextInt();
		int []b = new int[a];
		
		for (int i = 0; i < a; i++) {
			int t = scan.nextInt();
			b[i] = t;
		}
		
		scan.close();
		
		System.out.println(minCoinCnt(a, sum, b));
	}
	
	public static int minCoinCnt(int n, int sum, int[] coins) {		
		int count = 0;
		 
		for(int i = n - 1; i >= 0; i--) {
			if(coins[i] <= sum) {
				count += (sum / coins[i]);
				sum = sum % coins[i];
			}
		}
		
		return count;
	}
	
	
}
