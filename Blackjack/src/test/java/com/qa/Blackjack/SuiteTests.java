package com.qa.Blackjack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlayerResultTests.class, DealerResultTests.class, InvalidandDoubleBustTest.class })
public class SuiteTests {

}
