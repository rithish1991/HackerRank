package Com.Problem.Solving.Warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MiniMaxSum {

	static void miniMaxSum(int[] arr) {

		List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
		long sum = data.stream().mapToLong(Integer::longValue).sum();
		long newArr[] = new long[arr.length];
		for (int i = 0; i < arr.length; i++) {

			newArr[i] = sum - arr[i];
		}
		System.out.print(Arrays.stream(newArr).min().getAsLong());
		System.out.print(" ");
		System.out.print(Arrays.stream(newArr).max().getAsLong());

	}

	public static void main(String[] args) {

		int arr[] = { 793810624 ,895642170, 685903712 ,623789054, 468592370
 };
		miniMaxSum(arr);
	}

}
