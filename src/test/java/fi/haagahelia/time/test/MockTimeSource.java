package fi.haagahelia.time.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MockTimeSource {
	public Date getTimeMoment() {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date(0));
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.HOUR_OF_DAY, 11);
		calendar.add(Calendar.MINUTE, 22);
		calendar.add(Calendar.SECOND, 33);
		return calendar.getTime();
	}
}
