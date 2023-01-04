package enums;

public class Main {
	public static void main(String[] args) {
		// enums
		Day today = Day.WED;
		if (today == Day.WED) {
			System.out.println("Today is Wednesday.");
		}
	}
}

//enums
enum Day {
	MON, TUES, WED, THURS, FRI, SAT, SUN
};
