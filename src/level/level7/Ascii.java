package level.level7;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char alpa = sc.nextLine().charAt(0);
		int ialpa = (int) alpa;
		System.out.println(ialpa);

		sc.close();

	}
}
