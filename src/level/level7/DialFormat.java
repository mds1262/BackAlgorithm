package level.level7;

import java.util.Scanner;

public class DialFormat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
				
		scan.close();
		
		S.toUpperCase();
		
		String[] Sarr = S.split("");
		
		int time = 0;
		for(String k : Sarr) {
			
			if (k.equals("A") || k.equals("B") || k.equals("C")) {
				time += (1 + 2);
			}else if(k.equals("D") || k.equals("E") || k.equals("F")) {
				time += (1 + 3);
			}else if(k.equals("G") || k.equals("H") || k.equals("I")) {
				time += (1 + 4);
			}else if(k.equals("J") || k.equals("K") || k.equals("L")) {
				time += (1 + 5);
			}else if(k.equals("M") || k.equals("N") || k.equals("O")) {
				time += (1 + 6);
			}else if(k.equals("P") || k.equals("Q") || k.equals("R") || k.equals("S")) {
				time += (1 + 7);
			}else if(k.equals("T") || k.equals("U") || k.equals("V")) {
				time += (1 + 8);
			}else {
				time += (1 + 9);
			}
		}
		
		System.out.println(time);
	}
}
