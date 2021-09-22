package level.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AvgOver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < n; i++) {
			int c = scan.nextInt();
			
			List<Integer> scores = new ArrayList<Integer>();
			for(int j = 0; j < c; j++) {
				int score = scan.nextInt();
				
				scores.add(score);
			}
			
			l.add(scores);
//			DecimalFormat df = new DecimalFormat("#.###");
//			String strAvg = df.format(avg);
//			strAvg = strAvg + "%";
//			
//			avgs[i] = strAvg;
		}
		
		scan.close();
		
		List<Double> result = l.stream().map(x -> {
			double cnt = (double)x.stream().filter(s -> {
				double avg = x.stream().mapToInt(i -> i).average().getAsDouble();
				return s > avg;
			}).count();
			double per = (cnt/x.size())*100;
			return per;
		}).collect(Collectors.toList());
		
		for(double r: result) {
			System.out.printf("%.3f", r);
			System.out.println("%");
			
		}
	}
}
