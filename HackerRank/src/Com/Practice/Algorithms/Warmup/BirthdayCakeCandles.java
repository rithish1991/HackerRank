package Com.Practice.Algorithms.Warmup;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int[] arr) {
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (data.containsKey(arr[i])) {
				sum = data.get(arr[i]);
				data.put(arr[i], ++sum);
				continue;
			}
			data.put(arr[i], 1);

		}
		return Collections.max(data.values());

	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 3, 2, 2, 2, 3 };
		System.out.println(birthdayCakeCandles(arr));
	}

}
