package level.level6;

import java.util.Arrays;

public class NSum {
	long sum(int[] a) {
		return Arrays.stream(a).mapToLong(l -> l).sum();
	}
}
