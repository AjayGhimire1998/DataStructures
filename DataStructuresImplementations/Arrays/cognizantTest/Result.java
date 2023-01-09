package cognizantTest;

public class Result {

	public static void main(String[] args) {
		lastLetters("Ajay");
	}

	public static String lastLetters(String word) {
		String result = "";
		if (word.length() >= 2) {
			result = word.charAt(word.length() - 1) + " " + word.charAt(word.length() - 2);
		}
		System.out.println(result);
		return result;

	}
}
