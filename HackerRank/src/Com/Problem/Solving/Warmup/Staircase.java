package Com.Problem.Solving.Warmup;

public class Staircase {

	static void staircase(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print("    ");
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		staircase(5);
	}

}
