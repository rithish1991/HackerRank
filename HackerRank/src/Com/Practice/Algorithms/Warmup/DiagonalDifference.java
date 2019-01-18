package Com.Practice.Algorithms.Warmup;

public class DiagonalDifference {
	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int leftDiagonal = 0;
		int rightDiagonal = arr[0].length - 1;
		int leftDiagonalSum = 0, rightDiagonalSum = 0;
		for (int i = 0; i < arr[0].length; i++) {
			leftDiagonalSum = leftDiagonalSum + arr[i][leftDiagonal++];
			rightDiagonalSum = rightDiagonalSum + arr[i][rightDiagonal--];
		}
		return Math.abs(leftDiagonalSum - rightDiagonalSum);
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
		System.out.println(diagonalDifference(arr));

	}

}
