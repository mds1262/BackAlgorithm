package greed;

import java.util.Scanner;

public class Sugar {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg = scanner.nextInt();
		System.out.println(delevery(kg));
		scanner.close();
	}
	
	public static int delevery(int n) {
		int[] plasticBags = {3, 5};
		
//		List <Integer> l = Arrays.stream(plasticBags).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		Arrays.sort(plasticBags, Collections.reverseOrder());
		
		int count = 0;
		int sugar = n;
		while(sugar > 0) {
			if (sugar >= 5) {
				sugar -= plasticBags[1];
				count += 1;
				continue;
			}else if(sugar >= 3 &&sugar < 5) {
				sugar -= plasticBags[0];
				count += 1;
				continue;
			}
						
			if (sugar < 3) {
				count = -1;
				break;
			}
		}
		
		return count;
	}
}
