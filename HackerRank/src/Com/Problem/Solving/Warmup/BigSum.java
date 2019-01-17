package Com.Problem.Solving.Warmup;

import java.util.Arrays;
//Problem 2 
public class BigSum {

	static long aVeryBigSum(long[] ar) {
		return Arrays.stream(ar).sum();
	}

	public static void main(String[] args) {

		long arr[] = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
		System.out.println(aVeryBigSum(arr));
	}

}
