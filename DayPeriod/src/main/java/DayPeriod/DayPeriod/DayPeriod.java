package DayPeriod.DayPeriod;

import java.util.Date;

class DayPeriod {
	public String get_period(Date time) {
		int h = time.getHours();
		
		if (h >= 0 && h < 6) {
			return "Night";
		} else if (h >= 6 && h < 12) {
			return "Morning";
		} else if (h >= 12 && h < 18) {
			return "Noon";
		} else
			return "Evening";
	}
}
