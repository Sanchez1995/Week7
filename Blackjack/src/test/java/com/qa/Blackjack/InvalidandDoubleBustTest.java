package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvalidandDoubleBustTest {
	App blackjack;
	@Before
	public void setup() {
		blackjack = new App();
	}
	@Test
	public void playerandDealerBustTest() { 
		assertEquals(0, blackjack.blackjack(25, 30));
	}
	@Test
	public void invalidInputTest() {
		assertEquals("incorrect input", -1, blackjack.blackjack(2, 35));
	}

}
