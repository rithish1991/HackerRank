package Com.Practice.Algorithms.Warmup;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class PlusMinus {
	static void plusMinus(int[] arr) {

		
		int negtaiveVals = Arrays.stream(arr).filter(x -> x < 0).toArray().length;
		int positiveVals = Arrays.stream(arr).filter(x -> x > 0).toArray().length;
		int zeroVals = Arrays.stream(arr).filter(x -> x == 0).toArray().length;
		System.out.println((double)positiveVals / arr.length);
		System.out.println((double)negtaiveVals / arr.length);
		System.out.println((double) zeroVals / arr.length);

	}

	public static void main(String[] args) {

		int arr[] = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);

	}

}
