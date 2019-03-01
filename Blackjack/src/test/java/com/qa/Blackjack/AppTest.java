package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
  
{
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
	public void playerBustTest() {
		assertEquals(5, blackjack.blackjack(25, 5));
	}
	@Test
	public void dealerBustTest () {
		assertEquals(5, blackjack.blackjack(5, 25));
	}
	@Test
	public void playerWinsTest() {
		assertEquals(20, blackjack.blackjack(20,6));
	}
	@Test
	public void playerLosesTest() {
		assertEquals(20, blackjack.blackjack(6, 20));
	}
	@Test
	public void invalidInputTest() {
		assertEquals("incorrect input", -1, blackjack.blackjack(2, 35));
	}
		
   
}
