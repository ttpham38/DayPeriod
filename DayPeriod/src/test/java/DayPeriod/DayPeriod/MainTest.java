package DayPeriod.DayPeriod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class MainTest {

	public DayPeriod dayPeriod = new DayPeriod();
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	//Morning should be from 6:00:00 to 11:59:59
	public void testMorningPeriod() {
		Date time = new Date(2023, 8, 25, 11, 00); // Time: 11:00:00
		assertEquals("Morning", dayPeriod.get_period(time));
	}

	@Test
	//Noon should be from 12:00:00 to 17:59:59
	public void testNoonPeriod() {
		Date time = new Date(2023, 8, 25, 17, 10); // Time: 17:10:00	
		assertEquals("Noon", dayPeriod.get_period(time));
	}

	@Test
	//Night should be from 00:00:00 to 05:59:59
	public void testNightPeriod() {
		Date time = new Date(2023, 8, 25, 01, 00); // Time: 01:00:00
		assertEquals("Night", dayPeriod.get_period(time));
	}

	@Test
	//Evening should be from 18:00:00 to 23:59:59
	public void testEveningPeriod() {
		Date time = new Date(2023, 8, 25, 23, 00); // Time: 11:0:00
		assertEquals("Evening", dayPeriod.get_period(time));
	}
}
