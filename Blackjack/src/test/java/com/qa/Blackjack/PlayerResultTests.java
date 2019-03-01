package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlayerResultTests {
	App blackjack;
	@Before
	public void setup() {
		blackjack = new App();
	}
	@Test
	public void dealerBustTest () {
		assertEquals(5, blackjack.blackjack(5, 25));
	}
	@Test
	public void playerWinsTest() {
		assertEquals(20, blackjack.blackjack(20,6));
	}
	

}
