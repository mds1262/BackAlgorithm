package level.level7;

import java.util.Scanner;

public class ReverseCompare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		scan.close();
		
		String strA = String.valueOf(A);
		String strB = String.valueOf(B);

		String[] strAarr = strA.split("");
		String[] strBarr = strB.split("");
		
		
		strA = "";
		strB = "";
		for(int i = strAarr.length -1; i >= 0; i--) {
			strA += strAarr[i];
			strB += strBarr[i];
		}
		
		A = Integer.parseInt(strA);
		B = Integer.parseInt(strB);
		
		if (A > B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
		
	}
}
