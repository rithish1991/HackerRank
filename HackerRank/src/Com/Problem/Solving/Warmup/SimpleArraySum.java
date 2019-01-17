package Com.Problem.Solving.Warmup;

import java.util.Arrays;

//Problem 1
public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		return Arrays.stream(ar).sum();

	}

	public static void main(String[] args) {

		int arr[] = { 20, 30, 60, 45 };
		System.out.println(simpleArraySum(arr));

	}

}
