package greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int []b = new int[a];
		
		for (int i = 0; i < a; i++) {
			int t = scan.nextInt();
			b[i] = t;
		}
		
		scan.close();
		
		
		System.out.println(waitingTime(a, b));
	}
	
	public static int waitingTime(int n, int[] waits) {
		int answer = 0;
		
		Arrays.sort(waits);
		
		answer = IntStream.range(0, n).mapToObj(i -> {
			List<Integer> l = new ArrayList<Integer>();
			for(int j = 0; j <= i; j ++) {
				l.add(waits[j]);
			}
			return l;
		}).map(x -> {
			return x.stream().mapToInt(y -> y.intValue()).sum();
		}).mapToInt(s -> s.intValue()).sum();
				
		return answer;
	}
}
