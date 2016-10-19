package fi.haagahelia.time.test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeSourceTest {
	private MockTimeSource thetime;
	
	@Before
	public void createWatch() {
		thetime = new MockTimeSource();
	}
	
	@Test
	public void testGetTime() {
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		String actual = timeFormat.format(thetime.getTimeMoment());
		String expected = "13:22";
		assertEquals(expected, actual);
	}
	
}
