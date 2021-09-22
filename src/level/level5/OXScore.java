package level.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OXScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		List<String[]> l = new ArrayList<String[]>();
		
		for (int i = 0; i < n; i++) {
			String OX = scan.next();
			l.add(OX.split(""));
		}
		
		scan.close();
		
		List<Integer> result = l.stream().map(x -> {
			int sum = 0;
			int num = 0;
			for(String s : x) {
				if(s.equals("O")) {
					num += 1;
				}else {
					num = 0;
				}
				
				sum += num;
			}
			return sum;
		}).mapToInt(i -> i).boxed().collect(Collectors.toList());
		
		for(int r : result) {
			System.out.println(r);
		}
	}
}
