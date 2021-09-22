package greed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Conference {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [][]t = new int[n][2];
		for (int i = 0; i < n; i++) {
				t[i][0] = scan.nextInt();
				t[i][1] = scan.nextInt();
		}
		scan.close();
//		int n = 11;
//		int [][] t = {
//				{1,4},
//				{3, 5},
//				{0, 6},
//				{5, 7},
//				{3, 8},
//				{5, 9},
//				{6, 10},
//				{8, 11},
//				{8, 12},
//				{2, 13},
//				{12, 14}
//				};
		System.out.println(getConference(n ,t));
		
	}

	public static int getConference(int n, int[][] times) {
		Arrays.sort(times, new Comparator<int[]>() { //종료시간으로 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
                if(o1[1] - o2[1] == 0)
					return o1[0] - o2[0];
				return o1[1] - o2[1];
			}
		});
		
		int cnt = 0;
		int last = -1;
		for(int i=0; i<n; i++) {
			if(times[i][0] >= last) {
				cnt++;
				last = times[i][1];
			}
		}
		return cnt;
	}
//		List<ConferenceTime> ct = Arrays.stream(times).map(x -> new ConferenceTime(x[0],x[1]))
//				.sorted((a,b) -> {
//					if (a.getEnd() - b.getStart() == 0) {
//						return a.getStart() - b.getStart();
//					}
//					return a.getEnd() - b.getStart();
//				})
//				.collect(Collectors.toList());
//		
//		int cnt = 0;
//		ConferenceTime diffCt = null;
//		
//		for(int i = 0; i < n; i++) {
//			if (cnt == 0) {
//				diffCt = ct.get(i);
//				cnt +=1;
//				continue;
//			}
//			
//			if(ct.get(i).getStart() >= diffCt.getEnd()) {
//				diffCt = ct.get(i);
//				cnt +=1;
//			}
//		}
//		
//		return cnt;
//	}
	
}

//class ConferenceTime{
//	int start;
//	int end;
//	
//	public ConferenceTime(int s, int e) {
//		this.start = s;
//		this.end = e;
//	}
//	
//	public int getStart() {
//		return this.start;
//	}
//	
//	public int getEnd() {
//		return this.end;
//	}
//}
