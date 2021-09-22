package level.level5;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] scores = new int[n];
		
		for (int i = 0; i < n; i++) {
			int score = scan.nextInt();
			scores[i] = score;
		}
		
		scan.close();
		
		double avg = Arrays.stream(scores).average().getAsDouble();
		double maxScore = Arrays.stream(scores).max().getAsInt();
		
		System.out.println((avg/maxScore)*100);
		
	}
}
