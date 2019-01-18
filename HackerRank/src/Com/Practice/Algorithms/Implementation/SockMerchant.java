package Com.Practice.Algorithms.Implementation;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {
	static int sockMerchant(int n, int[] arr) {
		Set<Integer> data = new HashSet<Integer>();
		int countOfPairs = 0;
		for (int i = 0; i < arr.length; i++) {
			if (data.contains(arr[i])) {
				data.remove(arr[i]);
				countOfPairs++;
				continue;
			}
			data.add(arr[i]);
		}
		return countOfPairs;
	}
	public static void main(String[] args) {
		int n = 9;
		int a[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, a));

	}

}
