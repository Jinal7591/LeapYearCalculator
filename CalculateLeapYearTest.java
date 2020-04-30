package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.CalculateLeapYear;

public class CalculateLeapYearTest {

		private CalculateLeapYear leapYear;

		@Before
		public void setUp() throws Exception {
			leapYear = new CalculateLeapYear();
		}

		@Test
		public void when2012_thenIsLeap() {
			assertTrue(this.isLeapYear(2012));
		}

		@Test
		public void when2011_thenIsNotLeap() {
			assertFalse(this.isLeapYear(2011));
		}

		@Test
		public void when1700_thenIsNotLeap() {
			assertFalse(this.isLeapYear(1700));
		}

		@Test
		public void when2000_thenIsLeap() {
			assertTrue(this.isLeapYear(2000));
		}


		private boolean isLeapYear(int year) {
			return CalculateLeapYear.checkYear(year);
		}

}
