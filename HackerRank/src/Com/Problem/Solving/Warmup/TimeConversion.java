package Com.Problem.Solving.Warmup;

public class TimeConversion {

	static String timeConversion(String s) {

		String arr[] = s.split(":");
		String time = arr[2].replaceAll("\\d+", "");

		/*
		 * This checks whether time is 12:00 clock am or pm and returns the value
		 */
		if (arr[0].equalsIgnoreCase("12")) {

			String hoursString = time.equalsIgnoreCase("pm") ? "12" : "00";
			s = hoursString + ":" + arr[1] + ":" + arr[2];
		}
		/*
		 * This checks whether its pm and returns the value
		 */
		else if (time.equalsIgnoreCase("pm")) {
			int hours = Integer.parseInt(arr[0]) + 12;
			s = hours + ":" + arr[1] + ":" + arr[2];
		}

		return s.replaceAll("[A-Z]", "");
	}

	public static void main(String[] args) {
		System.out.println(timeConversion("12:45:54PM"));

	}

}
