package Com.Practice.Algorithms.Implementation;

public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] arr) {
		int pairs = 0;
		for(int i = 0; i<arr.length-1; i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				int sum = arr[i]+arr[j];
				int mod  = sum % k;
				if(mod == 0)
				{
					pairs++;
				}
			}
		}
		

		return pairs;
    }
	public static void main(String[] args)
	{
		
		int [] arr = {1,3,2,6,1,2};
		int n = 6,k=3;;
		divisibleSumPairs(n,k,arr);
		
	}
	
}
