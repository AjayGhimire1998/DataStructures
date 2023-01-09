package cognizantTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlowestKey {

	public static void main(String[] args) {
		List<List<Integer>> keysTime = new ArrayList<>();
		keysTime.add(new ArrayList<>(Arrays.asList(0, 2)));
		keysTime.add(new ArrayList<>(Arrays.asList(1, 5)));
		keysTime.add(new ArrayList<>(Arrays.asList(0, 9)));
		keysTime.add(new ArrayList<>(Arrays.asList(2, 15)));
		slowestKey(keysTime);
	}

	public static char slowestKey(List<List<Integer>> keyTimes) {
		int longTime = 0;
		int result = 0;

		for (int i = 1; i < keyTimes.size(); i++) {
			List<Integer> currentKeyTime = keyTimes.get(i);
			List<Integer> prevKeyTime = keyTimes.get(i - 1);
			int time = currentKeyTime.get(1) - prevKeyTime.get(1);

			if (time > longTime) {
				longTime = time;
				result = currentKeyTime.get(0);
			}
		}
		char[] alphabet = new char[26];

		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char) ('a' + i);
		}
		System.out.println(alphabet[result]);
		return alphabet[result];
	}

}
