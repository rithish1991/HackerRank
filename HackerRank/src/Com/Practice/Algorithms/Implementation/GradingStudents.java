package Com.Practice.Algorithms.Implementation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
	
	static int[] gradingStudents(int[] grades) {

		List<Integer> data = Arrays.stream(grades).boxed().collect(Collectors.toList()).stream().map(x -> {
			final int plusOne = x + 1;
			final int plusTwo = x + 2;
			if (x >= 38 && plusOne % 5 == 0) {
				return x + 1;
			} else if (x >= 38 && plusTwo % 5 == 0) {
				return x + 2;
			}
			return x;
		}).collect(Collectors.toList());

		return data.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args)
	{
	
		int arr[] = {73,67,39,34};
		gradingStudents(arr);
	}

}
