package workspace.com;

class Test {
	  public static void main(String[] args) {
	    System.out.println("#" + padLeftSpaces("mystring", 24) + "@");
	    System.out.println("#" + padLeftSpaces("mystring", 15) + "@");
	    System.out.println("#" + padLeftSpaces("mystring", 6) + "@");
	  }

	  public static String padLeftSpaces(String str, int n) {
	    return String.format("%1$" + n + "s", str);
	  }
	}
