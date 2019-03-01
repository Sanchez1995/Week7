package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DealerResultTests {
	App blackjack;
	@Before
	public void setup() {
		blackjack = new App();
	}

	@Test
	public void playerBustTest() {
		assertEquals(5, blackjack.blackjack(25, 5));
	}

	@Test
	public void playerLosesTest() {
		assertEquals(20, blackjack.blackjack(6, 20));

}
}
