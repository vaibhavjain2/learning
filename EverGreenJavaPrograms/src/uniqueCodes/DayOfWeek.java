package uniqueCodes;

public class DayOfWeek {

	static int dow(int y, int m, int d) {
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		if (m < 3)
			y--;
		return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
	}

	enum WeekDay {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		WeekDay weekday = WeekDay.values()[dow(1988, 03, 21)];
		System.out.println(weekday);
	}
}