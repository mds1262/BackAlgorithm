package level.level7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordStudy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		scan.close();

		List<Map<String, Integer>> l = Arrays.stream(S.split("")).map(x -> x.toUpperCase()).sorted()
				.collect(Collectors.groupingBy(x -> String.valueOf(x))).entrySet().stream().distinct()
				.sorted((a, b) -> {
					return b.getValue().size() - a.getValue().size();
				}).map(x -> {
					Map<String, Integer> m = new HashMap<String, Integer>();
					m.put(x.getKey(), x.getValue().size());
					return m;
				}).collect(Collectors.toList());

		String result = "";
		String k1 = (String) l.get(0).keySet().stream().map(x -> x).toArray()[0];
		result = k1;

		if (l.size() > 1) {
			String k2 = (String) l.get(1).keySet().stream().map(x -> x).toArray()[0];

			int i1 = l.get(0).get(k1);
			int i2 = l.get(1).get(k2);

			if (i1 == i2) {
				result = "?";
			}
		}

		System.out.println(result);
	}
}
