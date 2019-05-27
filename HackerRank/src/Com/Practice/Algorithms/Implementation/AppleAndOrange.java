package Com.Practice.Algorithms.Implementation;

public class AppleAndOrange {
	
	
	
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		 int appleSize= 0;
		 int orangeSize = 0;
		 int size = apples.length>oranges.length?apples.length:oranges.length;
		 for (int i=0;i<size;i++)
		 {
			 if(i<apples.length && apples[i]>=s && apples[i]<=t)
			 {
				 appleSize++;
			 }
			 else if(i<oranges.length && oranges[i]>=s && oranges[i]<=t)
			 {
				 orangeSize++;
				 
			 }
		 }
		 System.out.println(appleSize);
		 System.out.println(orangeSize);
		 
		 

	    }
	 
	 public static void main(String[] args) {
	 
		 
		 int s = 7 ,t =11;
		 int a = 5, b =15;
		 int[] apples = {-2, 2, 1};
		 int[] oranges = {5 ,-6};
		 countApplesAndOranges(s, t, a, b, apples, oranges);
	 }

}
