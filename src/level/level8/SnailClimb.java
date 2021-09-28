package level.level8;

import java.util.Scanner;
/**
 * 
 * @author deuksoomoon
 * 각각의 날에 대한 거리 계산을 표기해보자
 * 2 1 5 -> 4 
 * day totlaDistance climbDistance slideDistance
 * 1    0             2             1
 * 2    1             3             2
 * 3    2             4             3
 * 4    3             5             0
 * 각날의 최대거리는 낮에 올라간 거리가 최대 거리이다.
 * 해당 최대거리가 목표거리에 도달을 할경우 다시 내려가지 않는다.
 * 현재 구하는 목표가 몇일째에 최대거리에 도달하는지 확인
 * 각날에 최대 이동거리는 V = day*A-(day-1)*B
 * 몇일째에 가는지 식으로 변경
 * day*A -(B*day - B) -> day*A -B*day + B -> day(A - B) + B
 * V = day(A - B) + B -> (V - B) / (A - B) = day
 * 최종 식은 day = (V - B) / (A - B)
 */
public class SnailClimb {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String distances = scan.nextLine();
		
		String [] distance = distances.split(" ");
		
		double[] day = new double[distance.length];
		
		for(int i =0; i < day.length; i ++) {
			day[i] = Double.parseDouble(distance[i]);
		}
		
		
		scan.close();
		
		int answer = (int)Math.ceil(((day[2]-day[1])/(day[0]-day[1])));
		
		System.out.println(answer);
	}
}
