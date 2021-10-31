package level.level8;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author deuksoomoon
 * 2개의 큰수의 합을 구하기
 * BigInteger라는 java8버전에서 지원하는 라이브러리가 있음
 * primitive 타입으로 사용하면 제한이 걸림
 * 해당 라이브러리는 무한의 숫자를 제공함
 */
public class BigNumberSum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger A = new BigInteger(scan.next());
		BigInteger B = new BigInteger(scan.next());
		
		A = A.add(B);
		
		scan.close();
		
		System.out.println(A.toString());
	}
}
