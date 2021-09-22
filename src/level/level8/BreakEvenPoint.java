package level.level8;

import java.util.Scanner;

public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();

		int B = scan.nextInt();

		int C = scan.nextInt();

		scan.close();

		int margin = C - B;

		if (margin <= 0) {
			System.out.println("-1");
			return;
		}

		int evenPoint = (A / margin) + 1;

		System.out.println(evenPoint);

//		int cnt = 0;
//		
//		int Bsum = 0;
//		int Csum = 0;
//		
//		while(true) {
//			if(C-B <= 0) {
//				cnt = -1;
//				break;
//			}
//			
//			cnt += 1;
//			
//			Bsum = Bsum + B;
//			Csum = Csum + C;
//			
//			if(Csum - (Bsum + A) > 0) {
//				break;
//			}
//		}
//		
//		System.out.println(cnt);

	}
}
