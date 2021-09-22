package level.level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		List<String> l = Arrays.asList(S.split(""));
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(char i='a'; i<='z'; i++) {
			int findIdx = l.indexOf(String.valueOf(i));
			result.add(findIdx);
		}
		
		for(int s: result) {
			System.out.print(s+" ");
		}
		
		scan.close();
	}
}

