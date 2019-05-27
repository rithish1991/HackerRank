package Com.Problem.Solving.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
///(UNSOLVED STILL DIDNT UNDERSTAND THE PROBLEM)
public class ArrayManipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
	    long[] computation = new long[n];

	    for (int i = 0; i < queries.length; i++) {
	      int a = queries[i][0] - 1;
	      int b = queries[i][1] - 1;
	      int k = queries[i][2];

	      computation[a] += k;
	      if (b + 1 < n ) {
	        computation[b + 1] -= k;
	      }
	    }

	    long max = 0; long sum = 0;
	    for (int i = 0; i < n; i++) {
	      sum += computation[i];
	      max = Math.max(max, sum);
	    }

	    return max;
	  }
	static int incrementData(int num)
	{
		return num;
	}
	public static void main(String[] args) {
       //answer 31
		int array[][] = { { 1, 2, 100 }, { 2,5,100},{3,4,100} };
		System.out.println(arrayManipulation(10, array));
	}

}
