package Com.Practice.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareTheTriplets {

	static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		int sum = 0;
		for (int i = 0; i < alice.size(); i++) {
			if (alice.get(i) > bob.get(i)) {
				sum = list.get(0);
				list.set(0, ++sum);
			} else if (bob.get(i) > alice.get(i)) {
				sum = list.get(1);
				list.set(1, ++sum);

			}
		}
		return list;
	}

	public static void main(String[] args) {

		List<Integer> aliceList = Arrays.asList(17, 28, 30);
		List<Integer> bobList = Arrays.asList(99, 16, 8);
		compareTriplets(aliceList, bobList);
	}

}
