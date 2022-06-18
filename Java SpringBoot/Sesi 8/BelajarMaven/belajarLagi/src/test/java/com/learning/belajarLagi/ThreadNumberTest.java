package com.learning.belajarLagi;

import org.junit.Test;

public class ThreadNumberTest {
	public ThreadNumberTest() {

	}

	@Test
	public void testRun() {
			NumberGenerator instance = new NumberGenerator(1000, 2000);
			for (int j = 0; j < 3; j++) {
				new ThreadNumber(instance).start();
			}
		}
}