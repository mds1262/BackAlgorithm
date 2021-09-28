package level.level8;

import java.util.Scanner;

/**
 * 
 * @author deuksoomoon
 * 호텔의 호수 구하기
 * 1.호텔의 층수는 해당 N번째 들어오는 사람이 해당 층수을 넘을수 없고 다음 아래 층으로 내려가야됨
 * 그래서 N번째 % 높이 => 층수
 * 2.호수는 해당 층수만큼 다음호수가 증가 
 * 그래서 N번째 / 높이 => 호수 인데 N와높이가 같을경우는 층수를 알수가 없기 때문에 해당 높이 * 100 으로 해야하며
 * 몫은 고정같으로 나오기때문에 1을 더하지 않음
 */
public class FindHotelRoom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int[] result = new int[T];
		
		for(int i = 0; i < T; i++) {
			int H = scan.nextInt(), W = scan.nextInt(), N = scan.nextInt();

			result[i] = findRoomNum(H, N);
		}
		
		scan.close();
		
		for(int r : result) {
			System.out.println(r);
		}
	}
	
	private static int findRoomNum(int H, int N) {
		int floor = 0;
		
		if(N % H != 0) {
			floor = ((N % H) * 100) + ((N / H)+1);
			return floor;
		}
		
		floor =(H * 100) + (N / H);
		
		return floor;
	}
}
