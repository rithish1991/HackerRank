package workspace.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSumTest {

	public static void main(String[] args)
	{
		int arr[] = { 793810624 ,895642170, 685903712 ,623789054, 468592370};
		List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
		long sum = data.stream().mapToLong(Integer::longValue).sum();
		 System.out.print(sum);
		
		
	}
	
	
}
