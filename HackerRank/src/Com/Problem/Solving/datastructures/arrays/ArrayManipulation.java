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

public class ArrayManipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		int data[] =new int[n];
		int i = 0,sum=0;
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Callable<Integer>> listOfCallable = new ArrayList<Callable<Integer>>();
        while(i<n)
        {
        	final int k = i;
        	listOfCallable.add(()->{
        		for(int j=0;j<queries.length;j++)
        		{
        			int idx = k+1;
        			if(idx>=queries[j][0] && idx<=queries[j][1])
        			{
        				data[k] = data[k] + queries[j][2];
        			}
        			
        		}
        		return data[k]; 
        	});
        	i++;
        }
        try {

            List<Future<Integer>> futures = executor.invokeAll(listOfCallable);

             sum = futures.stream().map(f -> {
                try {
                    return f.get();
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }).mapToInt(Integer::intValue).max().getAsInt();

            System.out.println(sum);

        } catch (InterruptedException e) {// thread was interrupted
            e.printStackTrace();
        } finally {

            // shut down the executor manually
            executor.shutdown();

        }
        	
		return sum;

	}
	static int incrementData(int num)
	{
		return num;
	}
	public static void main(String[] args) {
       //answer 31
		int array[][] = { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };
		System.out.println(arrayManipulation(10, array));
	}

}
